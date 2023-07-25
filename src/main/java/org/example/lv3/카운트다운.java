package org.example.lv3;

/*https://school.programmers.co.kr/learn/courses/30/lessons/131129*/
public class 카운트다운 {
    int[][][] dp = new int[2][2][3]; //60?, bull, single double triple

    public int[] solution(int target) {
        int[] answer = new int[2];
        int[] cnt;//60?, bull, single double triple, cnt 값

        int MAXIMUM = 0;

        cnt = checkSingleDoubleTriple(target);

        int throwDart = throwDart(target, cnt[1],cnt[2]);

        answer[0] = throwDart;
        answer[1] = cnt[3];
        return answer;
    }

    public int[] checkSingleDoubleTriple(int target) {

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
        int singleOrDoubleOrTriple = 0;

        if(target%2==0) {
            singleOrDoubleOrTriple = 1;
        } else if (target%3==0) {
            singleOrDoubleOrTriple = 2;
        }

        return new int[]{sixty,bull,singleOrDoubleOrTriple,dp[sixty][bull][singleOrDoubleOrTriple]};
    }

    public int throwDart(int target, int sixty, int bull) {
        int sub = target;
        int throwDart = 0;

        if(sixty==1) {
            if(bull==0) {
                sub-=50;
                throwDart++;
                throwDart(sub, 1,1);
            } else {
                    throwDart++;
            }
        }

        return throwDart;
    }

}
