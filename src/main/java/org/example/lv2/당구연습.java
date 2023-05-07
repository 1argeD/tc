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
        Position whiteBall, goal = null;
        int[] answer = new int[balls.length];
        int i = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (startX == x && startY == y) {
                    whiteBall = new Position(x, y);
                    for (int[] ball : balls) {
                        goal = new Position(ball[0], ball[1]);
                        int distance = Integer.parseInt(String.valueOf(checking(m, n, whiteBall, goal)).replace(".0", ""));
                        answer[i++] = distance;
                        if (i == balls.length) break;
                    }
                }
            }
        }
        return answer;
    }

    public double checking(int m, int n, Position whiteBall, Position goal) {
        double a = Math.max(goal.x, whiteBall.x);
        double b = Math.min(goal.x, whiteBall.x);
        if (goal.y == whiteBall.y) {
            double k = (a - b) / 2;
            return (Math.pow(k, 2) + Math.pow(n - whiteBall.y, 2)) * 4;
        } else if (goal.x == whiteBall.x) {
            double k = (a - b) / 2;
            return (Math.pow(k, 2) + Math.pow(goal.x, 2)) * 4;
        } else if (goal.y<whiteBall.y) {
            double y = -goal.y;
            return Math.pow(whiteBall.x-goal.x,2)+Math.pow(whiteBall.y-y,2);
        } else {
            double x = -goal.x;
            return Math.pow(whiteBall.x - x, 2) + Math.pow(whiteBall.y - goal.y, 2);
        }
    }
}
