package org.example.lv2;


import java.util.HashMap;
import java.util.Map;

/*https://school.programmers.co.kr/learn/courses/30/lessons/181188*/
public class 요격시스템 {
    public int solution(int[][] target) {
        int answer =0;
        Map<Integer, Integer> s = new HashMap<>();

        for(int[] t : target) s.put(t[0], t[1]);

        for(int value : s.keySet()) {

        }
        return answer;
    }
}
