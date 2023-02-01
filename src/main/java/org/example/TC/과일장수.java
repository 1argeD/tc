package org.example.TC;

import java.util.ArrayList;
import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/135808?language=java*/
public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        ArrayList<Integer>box = new ArrayList<>();
        int s = 0;
        int min = 0;
        int cnt = 0;
        for(int i=score.length-1; i>=0; i--) {
            cnt++;
            box.add(score[i]);
            min = Math.min(10,score[i]);
            if(cnt%m==0) {
                s=min*m;
                answer+=s;
            }
        }
        return answer;
    }
}
