package org.example.TC;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120923?language=java*/

public class 연속된수의합 {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];

            int nSum = num * (1 + num ) / 2;
            int start = (total - nSum)/num;

            for(int i = 1; i < num + 1;  i++) {
                answer[ i - 1] = i + start;
            }
            return answer;
        }
}
