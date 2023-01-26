package org.example.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150369*/
public class 택배배달과수거하기 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        int give = 0;
        int get = 0;

        for(int i = n-1; i>=0; --i) {
            if(deliveries[i]!=0||pickups[i]!=0) {
                int cnt = 0;
                while (give<deliveries[i]||get<pickups[i]) {
                    ++cnt;
                    give+=cap;
                    get+=cap;
                }
                give -= deliveries[i];
                get -= pickups[i];
                answer = answer  + ((long) (i + 1) * cnt * 2);
            }
        }
        return answer;
    }
}
