package org.example.TC;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/133502*/
public class 햄버거만들기 {

    /*이번 문제는 연산 속도가 중요하기 떄문에 String 의 연산 속도를 사용하면 StringBuilder 이나 StringBuffer 을 사용해야한다.
    * replace() 사용하면 실패가 뜰 수 있음*/
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingred = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            ingred.push(ingredient[i]);
            while (ingred.size() >= 4 && ingred.peek() == 1) {
                String burger = "";
                for (int j = 0; j < 4; j++) {
                    burger = ingred.pop() + burger;
                }
                if (!burger.equals("1231")) {
                    for (int j = 0; j < 4; j++) {
                        ingred.push(Integer.parseInt(burger.charAt(j) + ""));
                    }
                    break;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }

        public int solution2(int[] ingredient) {
            int[] stack = new int[ingredient.length];
            int sp = 0;
            int answer = 0;
            for (int i : ingredient) {
                stack[sp++] = i;
                if (sp >= 4 && stack[sp - 1] == 1
                        && stack[sp - 2] == 3
                        && stack[sp - 3] == 2
                        && stack[sp - 4] == 1) {
                    sp -= 4;
                    answer++;
                }
            }
            return answer;
        }

}
