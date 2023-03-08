package org.example.TC;

import java.util.HashMap;
import java.util.Map;
/*https://school.programmers.co.kr/learn/courses/30/lessons/1845*/
public class 포켓몬 {
    public int solution(int[] nums) {
        Map<Integer, Integer> kind = new HashMap<>();
        int answer =0;
        for(int k : nums) kind.put(k, k+1);
        answer =Math.min(nums.length/2, kind.size());
        return answer;
    }
}

