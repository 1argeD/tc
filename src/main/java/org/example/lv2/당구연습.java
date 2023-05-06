package org.example.lv2;

import javax.lang.model.type.ErrorType;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169198*/
public class 당구연습 {
    class Position {
        int x,y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        Position whiteBall, goal = null;

        for(int x=0; x<m; x++) {
            for(int y=0; y<n; y++) {
                if(startX==x&&startY==y) {
                    whiteBall=new Position(x,y);
                    for(int[] ball : balls) {
                        goal = new Position(ball[0], ball[1]);
                        checking(m, n, whiteBall, goal);
                    }
                }
            }
        }
        return new int[] {};
    }

    public int checking(int m , int n, Position whiteBall, Position goal) {
        if(goal.x< whiteBall.x&&goal.y>whiteBall.y) {
            int k = whiteBall.x-goal.x%2+ goal.x;
              return (int) (Math.pow(k, 2) + Math.pow(n,2));
        }
        return 0;
    }
}
