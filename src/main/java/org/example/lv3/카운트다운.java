package org.example.lv3;

public class 카운트다운 {

    public int[] solution(int target) {
        int[] answer = new int[2];

        int[][][] dp = new int[2][2][3]; //60?, bull, single double triple

        dp[1][0][0] = 1;
        dp[1][0][1] = 0;
        dp[1][0][2] = 0;

        dp[1][1][0] = 1;
        dp[1][1][1] = 1;
        dp[1][1][2] = 1;

        boolean isSixty = target > 60;
        boolean isBull = target > 50;

        int sixty = isSixty ? 1:0;
        int bull = isBull ? 0:1;
        int singleOrDoubleOrTriple = checkSingleDoubleTriple(target);

        int cnt = dp[sixty][bull][singleOrDoubleOrTriple];

        return null;
    }

    public int checkSingleDoubleTriple(int target) {
        if(target%2==0) {
            return 1;
        } else if (target%3==0) {
            return 2;
        } else {
            return 0;
        }
    }

}
