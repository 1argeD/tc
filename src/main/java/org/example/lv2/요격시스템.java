package org.example.lv2;

import java.util.Arrays;
import java.util.Comparator;

/*https://school.programmers.co.kr/learn/courses/30/lessons/181188*/
public class 요격시스템 {
    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));
        int cnt = 0;
        double last = -1;

        for (int[] t : targets) {
            if (t[0] > last) {
                cnt++;
                last = t[1] - 0.5;
            }
        }
        return cnt;
    }

}
