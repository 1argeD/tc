package org.example.TC;

import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120912*/
public class 칠의개수 {
    public int solution(int[] arrays) {
        String[] list = Arrays.toString(arrays).split("");
        int answer = 0;
        for (String s : list) {
            if (s.matches("7")) answer++;
        }
        return answer;
    }
}
