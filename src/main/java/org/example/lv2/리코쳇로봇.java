package org.example.lv2;

import javax.management.openmbean.ArrayType;
import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169199*/
public class 리코쳇로봇 {

    public class Position{
        int x, y, count;
        Position(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public int solution(String[] board) {
        int[][] Direction = {{1,0},{-1,0},{0,1},{0,-1}};
        Position start = null, goal = null;

        for(int i = 0; i < board.length; i++) {
            for(int j=0; j < board[i].length(); j++) {
                if(board[i].charAt(j)=='R') {
                    start = new Position(i, j , 0);
                } else if(board[i].charAt(j)=='G') {
                    goal = new Position(i, j, 0);
                }
            }
        }

        boolean[][] visited = new boolean[board.length][board[0].length()];
        Queue<Position> positionQueue = new ArrayDeque<>();
        positionQueue.add(start);

        while (!positionQueue.isEmpty()) {
            Position position = positionQueue.poll();
            int x = position.x;
            int y = position.y;
            int count = position.count;

            if(visited[x][y]) {
                continue;
            }
            visited[x][y] = true;

            if(x == Objects.requireNonNull(goal).x && y == goal.y) {
                return count;
            }

            for(int[] direction : Direction) {
                int xPoint = x; int yPoint = y;
                while (0 <= xPoint + direction[0] &&
                        xPoint + direction[0] <board.length &&
                        0<= yPoint + direction[1] &&
                        yPoint + direction[1] < board[0].length() &&
                        board[xPoint + direction[0]].charAt(yPoint+direction[1]) != 'D') {

                    xPoint += direction[0];
                    yPoint += direction[1];
                }
                if(!visited[xPoint][yPoint]) {
                    positionQueue.add(new Position(xPoint, yPoint, count+1));
                }
            }
        }

        return -1;
    }


}
