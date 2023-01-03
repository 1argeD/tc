package org.example.TC;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/133502*/
public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger = "1231";
        StringBuilder ingred = new StringBuilder();
        for(int in : ingredient) { ingred.append(in);}
        {String IntIn = ingred.toString();
            while (IntIn.contains(burger)) {
                ingred.replace();
                answer++;
            }
        }
        return answer;
    }
}
