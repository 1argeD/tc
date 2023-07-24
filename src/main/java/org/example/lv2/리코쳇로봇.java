package org.example.lv2;

import java.util.ArrayDeque;
import java.util.Queue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169199*/
public class 리코쳇로봇 {
    class Position {
        int x, y, cnt;

        public Position(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
        public int solution(String[] board) {
            Position start = null, goal = null;
            int[][] move = {{1,0},{-1,0},{0,1},{0,-1}};
            /*i=x  j=y*/
            for(int i = 0; i<board.length; i++) {
                for(int j=0; j<board[i].length(); j++) {
                    if(board[i].charAt(j)=='R') start = new Position(i,j,0);
                    else if(board[i].charAt(j)=='G') {
                        goal = new Position(i,j,0);
                    }
                }
            }

            Queue<Position>positionQueue = new ArrayDeque<>();
            boolean[][] visited = new boolean[board.length][board[0].length()];
            positionQueue.add(start);

            while (!positionQueue.isEmpty()) {
                Position position = positionQueue.poll();
                int x = position.x, y = position.y, cnt = position.cnt;

                if(visited[x][y]) continue;
                visited[x][y] = true;

                if(x == goal.x && y == goal.y) return cnt;

                for(int[] movePoint : move) {
                    int xPoint = x, yPoint = y;
                    while (0<=xPoint+movePoint[0]&&
                    xPoint+movePoint[0]< board.length&&
                    0<=yPoint+movePoint[1]&&
                    yPoint+movePoint[1]<board[0].length()&&
                    board[xPoint+movePoint[0]].charAt(yPoint+movePoint[1])!='D') {
                        xPoint += movePoint[0];
                        yPoint += movePoint[1];
                    }
                    if(!visited[xPoint][yPoint]) positionQueue.add(new Position(xPoint, yPoint,cnt+1));
                }
            }

            return -1;
        }
    }



