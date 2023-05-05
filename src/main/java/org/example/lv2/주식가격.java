package org.example.lv2;

import java.util.Stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42584*/
public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<prices.length; i++) {
            while (!stack.isEmpty()&&prices[i]<prices[stack.peek()]) {
                answer[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.peek()]=prices.length-stack.peek()-1;
            stack.pop();
        }
        return answer;
    }

    public int[] solution2(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i =0; i<prices.length; i++) {
            for(int j = i+1; j<prices.length;j++) {
                if(prices[i]>prices[j]) {
                 answer[i]--;
                }
                answer[i]++;
            }
        }
        return answer;
    }
}

