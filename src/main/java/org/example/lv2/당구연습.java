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
           int case1 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x - goal.x, 2) + Math.pow(2 * n - goal.y, 2))).replace(".0", ""));
           int case2 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x - goal.x, 2) + Math.pow(whiteBall.y + goal.y, 2))).replace(".0", ""));
            return Math.min(case1, case2);
        } else if(goal.y== whiteBall.y){
           int case1 = Integer.parseInt(String.valueOf((Math.pow(2 * m - goal.x, 2) + Math.pow(whiteBall.y - goal.y, 2))).replace(".0", ""));
           int case2 = Integer.parseInt(String.valueOf((Math.pow(whiteBall.x + goal.x, 2) + Math.pow(whiteBall.y - goal.y, 2))).replace(".0", ""));
            return Math.min(case1, case2);
        } else {
        /*x=0*/
        double case1 = Math.pow(whiteBall.x + goal.x, 2) + Math.pow(whiteBall.y - goal.y, 2);
        /*x=10*/
        double case2 = Math.pow(whiteBall.x - (2 * m - goal.y), 2) + Math.pow(whiteBall.y - goal.y, 2);
        /*y=0*/
        double case3 = Math.pow(whiteBall.x - goal.x, 2) + Math.pow(whiteBall.y + goal.y, 2);
        /*y=10*/
        double case4 = Math.pow(whiteBall.x - goal.x, 2) + Math.pow(whiteBall.y - (2 * m - goal.y), 2);
        int k = (int) Math.min(case1, case2);
        int s = (int) Math.min(case3, case4);
        return Math.min(s, k);
    }
}
}

//    double a = Math.max(goal.x, whiteBall.x);
//    double b = Math.min(goal.x, whiteBall.x);
//    double c = Math.max(goal.y, whiteBall.y);
//    double d = Math.min(goal.y, whiteBall.y);
//        if (goal.y == whiteBall.y) {
//                double k = (a - b) / 2;
//                return Integer.parseInt(String.valueOf((Math.pow(k, 2) + Math.pow(n - whiteBall.y, 2)) * 4).replace(".0", ""));
//                } else if (goal.x == whiteBall.x) {
//                double k = (c - d) / 2;
//                return Integer.parseInt(String.valueOf((Math.pow(k, 2) + Math.pow(goal.x, 2)) * 4).replace(".0", ""));
//                } else {

