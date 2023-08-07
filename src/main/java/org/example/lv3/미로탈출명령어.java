package org.example.lv3;

import java.util.Comparator;
import java.util.PriorityQueue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150365*/
public class 미로탈출명령어 {

    class Position {
        int a, b, count;
        String route;

        public Position(int a, int b, int count, String route) {
            this.a = a;
            this.b = b;
            this.count = count;
            this.route = route;
        }
    }
    public String solution(int n, int m, int x, int y, int r, int c, int k ) {

                int[][] movePoint = {{1,0},{-1,0},{0,1},{0,-1}};

                Position start = new Position(x-1, y-1,0, "");
                Position end = new Position(r-1,c-1,k,"dllrl");

        PriorityQueue<Position> priorityPosition = new PriorityQueue<>(Comparator.comparing(o->o.route));
        priorityPosition.add(start);

        while (!priorityPosition.isEmpty()) {
            Position position = priorityPosition.poll();
            int X = position.a; int Y = position.b; int CNT = position.count; String answer = position.route;

            if(X == end.a && Y == end.b && CNT == k) { return answer;}

            if(!possibleOrImpossible(X,Y,end.a,end.b,k-CNT)) continue;

            for(int[] move :  movePoint) {
                int rl = X, ud = Y, count=answer.length(); String ANSWER=answer;
                if(
                        rl+move[0]>=0&&
                        ud+move[1]>=0&&
                        n>rl+move[0] &&
                        m>ud+move[1] &&
                        count<=k
                    ) {

                    rl+=move[0];
                    ud+=move[1];

                    if(move[0]>0) { ANSWER+="d";}
                    else if (move[1]>0) { ANSWER+="r";}
                    else if(move[0]<0) { ANSWER+="u";}
                    else if(move[1]<0) { ANSWER+="l";}

                    count = answer.length()+1;

                    priorityPosition.add(new Position(rl , ud, count, ANSWER));

                }
            }

        }

        return "impossible";
    }
    public boolean possibleOrImpossible(int x, int y, int r, int c, int k) {
        int rest = Math.abs(r-x)+Math.abs(c-y);
        return (rest%2)-(k%2)  == 0&&rest<=k;
    }
}
