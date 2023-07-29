package org.example.lv3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class 미로탈출명령어 {    public class Position {
    int a,b,cnt;
    StringBuilder pattern;
    Position(int a, int b, int cnt, StringBuilder pattern)  {
        this.a = a;
        this.cnt = cnt;
        this.b = b;
        this.pattern=pattern;
    }

}

    public String solution(int n,int m, int x, int y, int r, int c,int k){

        int[][] movePoint = {{1,0},{-1,0},{0,1},{0,-1}};

        Position start = new Position(x-1,y-1,0,new StringBuilder());
        Position end = new Position(r-1,c-1,k,new StringBuilder());

        PriorityQueue<Position> positionQueue = new PriorityQueue<>((Comparator.comparing(o -> o.pattern)));
        positionQueue.offer(start);

        while(!positionQueue.isEmpty()) {
            Position position = positionQueue.poll();
            int queueX = position.a; int queueY = position.b; int CNT = position.cnt; StringBuilder pattern = new StringBuilder(position.pattern);

            if(end.a==queueX&&end.b==queueY&&CNT==k) return pattern.toString();

            if(CNT > k) continue;

            if(!impossible(queueX,queueY,end.a,end.b,k-CNT)) continue;

            for(int[] move : movePoint) {
                int X = queueX, Y = queueY, count=0;
                StringBuilder answer;

                if (
                        count != k &&
                                X+move[0]>=0 &&
                                Y+move[1]>=0 &&
                                X+move[0]<n &&
                                Y+move[1]<m
                )
                {
                    if(X < 0 || Y < 0 || X>=n || Y >= m) continue;

                    X+=move[0];
                    Y+=move[1];

                    pattern = new StringBuilder(position.pattern);

                    if(move[0]>0) {  pattern.append("d"); }
                    else if(move[0]<0) {  pattern.append("u"); }
                    else if(move[1]>0) {  pattern.append("r"); }
                    else if(move[1]<0) {  pattern.append("l"); }
                    count = pattern.length();
                    answer = pattern;
                    positionQueue.offer(new Position(X, Y, count, answer));
                }
            }
        }
        return "impossible";
    }

    boolean impossible(int x, int y, int r, int c, int k) {
        int rest = Math.abs(r - x) + Math.abs(c - y);
        return (rest % 2) - (k % 2) == 0 && rest <= k;
    }


}
