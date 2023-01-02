package org.example.TC;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/133502*/
public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger = "1231";
        for(int i =0; i<ingredient.length; i++) {
            Stack<Integer> ingred = new Stack<Integer>();
           ingred.add(ingredient[i]);
           if(ingred.contains(burger)) {
               answer++;
           }
        }
        return answer;
    }
}
