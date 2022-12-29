package org.example.TC;

import java.util.PriorityQueue;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if(priorityQueue.size()>k) {
                priorityQueue.poll();
            }
            /*peek()은 스택 위의 가장 위의 element를 반환한다.*/
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
