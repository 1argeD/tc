package org.example.TC;

import java.util.PriorityQueue;
/*https://school.programmers.co.kr/learn/courses/30/lessons/138477?language=java*/
public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if(priorityQueue.size()>k) {
                priorityQueue.poll();
            }
            /*peek()은 스택 위의 가장 위의 element 를 반환한다.*/
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}
