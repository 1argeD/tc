package org.example.lv2;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169198*/
public class 당구연습 {
    class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        Position whiteBall = new Position(startX, startY), goal = null;
        int[] answer = new int[balls.length];
        int i = 0;
        for (int[] ball : balls) {
            goal = new Position(ball[0], ball[1]);
            int distance = checking(m, n, whiteBall, goal);
            answer[i++] = distance;
        }
        return answer;
    }

    public int checking(int m, int n, Position whiteBall, Position goal) {

        if (goal.x == whiteBall.x) {
            int case1 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.y - goal.y, 2) + Math.pow(2 * m - 2 * goal.x, 2))).replace(".0", ""));
            int case2 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x + goal.x, 2) + Math.pow(whiteBall.y - goal.y, 2))).replace(".0", ""));
            return Math.min(case1,case2);
        } else if (goal.y == whiteBall.y) {
            int case1 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x - goal.x, 2) + Math.pow(2 * n - 2 * goal.y, 2))).replace(".0", ""));
            int case2 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x - goal.x, 2) + Math.pow(whiteBall.y + goal.y, 2))).replace(".0", ""));
            return Math.min(case1,case2);
        } else {
            /*x=0*/
            int case1 = Integer.parseInt(String.valueOf(Math.pow(whiteBall.x + goal.x, 2) + Math.pow(whiteBall.y - goal.y, 2)).replace(".0",""));
            /*x=10*/
            int case2 = Integer.parseInt(String.valueOf(Math.pow(whiteBall.x - (2 * m - goal.x), 2) + Math.pow(whiteBall.y - goal.y, 2)).replace(".0",""));
            /*y=0*/
            int case3 = Integer.parseInt(String.valueOf(Math.pow(whiteBall.x -goal.x, 2) + Math.pow(whiteBall.y+goal.y, 2)).replace(".0",""));
            /*y=10*/
            int case4 = Integer.parseInt(String.valueOf(Math.pow(whiteBall.x - goal.x, 2) + Math.pow(whiteBall.y - (2 * n -  goal.y), 2)).replace(".0",""));
            int k = Math.min(case1, case2);
            int s = Math.min(case3, case4);
            return Math.min(s, k);
        }
    }
    public int[] solution2(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        int[][] reflectBalls = {{-startX, startY}, {startX, -startY}, {2 * m - startX, startY}, {startX, 2 * n - startY}};

        for (int i=0; i< balls.length; i++) {
            int wx = balls[i][0];
            int wy = balls[i][1];
            int minDistanceSquared = Integer.MAX_VALUE;
            for(int j=0; j<4; j++){
                if(reflectBalls[j][0]==wx){
                    if(Math.min(reflectBalls[j][1],startY)<wy&&Math.max(reflectBalls[j][1],startY)>wy) continue;
                }
                else if(reflectBalls[j][1]==wy){
                    if(Math.min(reflectBalls[j][0],startX)<wx&&Math.max(reflectBalls[j][0],startX)>wx) continue;
                }
                int dx = Math.abs(wx-reflectBalls[j][0]);
                int dy = Math.abs(wy-reflectBalls[j][1]);
                int distanceSquared = dx * dx + dy * dy;

                minDistanceSquared = Math.min(minDistanceSquared, distanceSquared);
            }
            answer[i]=minDistanceSquared;
        }
        return answer;
    }
}


