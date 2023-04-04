package org.example.lv3;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/118668*/
public class 코딩테스트공부 {
    public int solution(int alp, int cop, int[][] problems) {
       int goal_a = 0;
       int goal_c = 0;

       for(int i = 0; i <problems.length; i++) {
           goal_a = Math.max(problems[i][0], goal_a);
           goal_c = Math.max(problems[i][1], goal_c);
       }

        int[][] dp = new int [goal_a+2][goal_c+2];

        dp[alp][cop] = 0;
        int answer = 0;


        return answer;
    }
}
