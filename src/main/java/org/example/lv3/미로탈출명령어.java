package org.example.lv3;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class 미로탈출명령어 {
    public class Postion {
        int a,b,cnt;
        String pattern;
        Postion(int a, int b, int cnt, String pattern) {
            this.a = a;
            this.cnt = cnt;
            this.b = b;
            this.pattern=pattern;
        }
    }
    public String solution(int n,int m, int x, int y, int r, int c,int k){

        int[][] movePoint = {{1,0},{-1,0},{0,1},{0,-1}};

        boolean[][] field = new boolean[n][m];

        Postion start = new Postion(x-1,y-1,0,"");
        Postion end = new Postion(r-1,c-1,k,"");

        field[end.a][end.b]=true;

        PriorityQueue<Postion> postionQueue = new PriorityQueue<>(((o1, o2) -> o1.pattern.compareTo(o2.pattern)));
        postionQueue.offer(start);


        while(!postionQueue.isEmpty()) {

            Postion position = postionQueue.poll();

            int queueX = position.a; int queueY = position.b; int CNT = position.cnt; StringBuilder pattern = new StringBuilder(position.pattern);
            if(field[queueX][queueY] && CNT==k) return pattern.toString();
            if(CNT > k) continue;

            if(!impossible(queueX,queueY,end.a,end.b,k-CNT)) continue;

            for(int[] move : movePoint) {
                int X = queueX, Y = queueY, count = pattern.length();
                String answer = pattern.toString();

                while (
                        count != k &&
                        X+move[0]>0 &&
                        Y+move[1]>0 &&
                        X+move[0]<n &&
                        Y+move[1]<m
                )
                {
                    if(X < 0 || Y < 0 || X>=n || Y >= m) continue;

                    X+=move[0];
                    Y+=move[1];

                    ++count;

                    if(move[0]>0) { pattern.append("r");}
                    else if(move[0]<0) { pattern.append("l");}
                    else if(move[1]>0) { pattern.append("d");}
                    else if(move[1]<0) { pattern.append("u");}
                    answer=pattern.toString();
                    postionQueue.offer(new Postion(X, Y, count,answer));
                }
            }
        }
        return "impossible";
    }

    boolean impossible(int x, int y, int r, int c, int k) {
        int rest = Math.abs(r-x)+Math.abs(c-y);
        if((rest % 2) - (k % 2) == 0) return true;
        if(rest>k) return false;
        return false;
    }




}
