package org.example.lv3;

import java.util.PriorityQueue;
import java.util.Queue;

public class 미로탈출명령어 {
    public class Postion {
        int a,b,cnt;
        char SG;
        String pattern;
        Postion(int a, int b, int cnt, char SG, String pattern) {
            this.a = a;
            this.cnt = cnt;
            this.b = b;
            this.SG = SG;
            this.pattern=pattern;
        }
    }
    public String solution(int n,int m, int x, int y, int r, int c,int k){

        int[][] movePoint = {{1,0},{-1,0},{0,1},{0,-1}};

        boolean[][] filed = new boolean[n][m];

        Postion start = new Postion(x-1,y-1,k,'S',"");
        Postion end = new Postion(r-1,c-1,0,'G',"");

        Queue<Postion> postionQueue = new PriorityQueue<>((o1,o2)-> o1.pattern.compareTo(o2.pattern));
        postionQueue.add(start);

        while(!postionQueue.isEmpty()) {
            Postion postion = postionQueue.poll();
            int positionX = postion.a; int positionY = postion.b; int CNT = postion.cnt; char poitionSG = postion.SG; String pattern =postion.pattern;

            filed[positionX][positionY] = true;

            if(positionX==end.a && positionY==end.b && CNT==0) {
                return pattern;
            }


            if(!impossible(positionX,positionY,r-1,c-1,k)) continue;

            for(int[] moveP : movePoint) {
                int xPoint = positionX, yPoint = positionY; int pointCNT =postion.cnt; char sg = poitionSG;
                String answer = pattern;

                while(xPoint+moveP[0]>=0&&
                        yPoint+moveP[1]>=0&&
                        xPoint+moveP[0]<filed.length&&
                        yPoint+moveP[1]<filed[0].length&&
                        end.SG!=sg
                ) {
                    xPoint+=moveP[0];
                    yPoint+=moveP[1];

                    if(xPoint+moveP[0]>xPoint) {pointCNT--; answer = pattern+"l";}
                    else if(yPoint+moveP[1]>yPoint){ pointCNT--;answer = pattern+"u";}
                    else if(xPoint+moveP[0]<xPoint) {pointCNT--; answer = pattern+"r";}
                    else if(yPoint+moveP[1]<yPoint){ pointCNT--; answer = pattern+"d";}
                    else if(xPoint+moveP[0]==end.a&&yPoint+moveP[0]==end.b) {
                        sg='G';
                    }
                }
                if(!filed[xPoint][yPoint]) postionQueue.add(new Postion(xPoint, yPoint, pointCNT, sg, answer));
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
