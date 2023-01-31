package org.example.TC;

import java.util.ArrayList;
import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/135808?language=java*/
public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> box = new ArrayList<>();
        Arrays.sort(score);
        for(int i=score.length-1; i>score.length%m; i--) {
            answer+=score[i];
        }
        return answer;
    }
}
