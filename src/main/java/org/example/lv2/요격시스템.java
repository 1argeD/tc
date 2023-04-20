package org.example.lv2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*https://school.programmers.co.kr/learn/courses/30/lessons/181188*/
public class 요격시스템 {
    public int solution(int[][] target) {
        int answer = 0;
       Arrays.sort(target, ((o1, o2) -> {
           System.out.println(o1[1] - o2[1]);
           return o1[1] - o2[1];
       }));
        return answer;
    }
}
