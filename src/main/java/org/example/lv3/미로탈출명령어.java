package org.example.lv3;

import org.yaml.snakeyaml.util.ArrayStack;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 미로탈출명령어 {
    public class Postion {
        int a,b,cnt;
        String pattern;
        Postion(int a, int b,int cnt,String pattern) {
            this.a = a;
            this.b = b;
            this.cnt = cnt;
            this.pattern=pattern;
        }
    }
    public String solution(int n,int m, int x, int y, int r, int c,int k){

        int[][] movePoint = {{1,0},{-1,0},{0,1},{0,-1}};

        boolean[][] filed = new boolean[n][m];

        Postion start = new Postion(x,y,k,"");
        Postion end = new Postion(r,c,k,"");

        Queue<Postion> postionQueue = new PriorityQueue<>((o1,o2)-> o1.pattern.compareTo(o2.pattern));
        postionQueue.add(start);

        while(!postionQueue.isEmpty()) {
            Postion postion = postionQueue.poll();
            int positionX = postion.a-1; int positionY = postion.b-1; int cnt = postion.cnt; String pattern =postion.pattern;

            if(filed[positionX][positionX]) continue;

            filed[positionX][positionX] = true;


            if(positionX==end.a && positionY==end.b && cnt==0 ) {
                return pattern;
            }


            if(!impossible(positionX,positionY,r-1,c-1,cnt)) continue;

            for(int[] moveP : movePoint) {
                int xPoint = positionX, yPoint = positionY, CNT = cnt;
                String answer = pattern;

                while(CNT!=0&&
                        xPoint+moveP[0]>0&&
                        yPoint+moveP[1]>0&&
                        xPoint+moveP[0]<filed.length&&
                        yPoint+moveP[1]<filed[0].length
                ) {
                    xPoint+=moveP[0];
                    yPoint+=moveP[1];
                    if(xPoint+moveP[0]>xPoint) { cnt--; answer = pattern+"l";}
                    else if(yPoint+moveP[1]>0){ cnt--; answer = pattern+"u";}
                    else if(xPoint+moveP[0]<0) { cnt--; answer = pattern+"r";}
                    else { cnt--; answer = pattern+"d";}

                }
                if(!filed[xPoint][yPoint]) postionQueue.add(new Postion(xPoint,yPoint,cnt,answer));
            }
        }
        return "impossible";
    }

    boolean impossible(int x, int y, int r, int c, int k) {
        int rest = Math.abs(r-x)+Math.abs(c-y);
        if((rest - k) % 2 == 0) return true;
        if(rest>k) return false;
        return false;
    }

}
