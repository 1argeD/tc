package org.example.lv2;

import java.util.Arrays;
/*https://school.programmers.co.kr/learn/courses/30/lessons/131130?language=java*/
public class 혼자놀기의달인 {
    private int fristValue = 0;
    private int secondValue = 0;
    public int solution(int[] cards) {
        int answer = 0;
        int[] tmpCards = Arrays.copyOf(cards, cards.length);/*Arrays.copyOf(원본배열, 복사하고 싶은 배열길이)는 배열복사 함수*/
        int[] tmpSecond;
        for (int i  = 0; i < tmpCards.length; i++) {
            fristValue = getOpenedCount(i, tmpCards);
            int leftCount = (int) Arrays.stream(tmpCards).filter(val -> val != -1).count();
            if (leftCount != 0) {
                for (int j =0; j< tmpCards.length; j++){
                    if(tmpCards[j] == -1) {
                        continue;
                    }
                    tmpSecond = Arrays.copyOf(tmpCards, tmpCards.length);
                    secondValue = getOpenedCount(j, tmpSecond);
                    answer = Math.max(answer, fristValue * secondValue);
                }
            }
            fristValue = 0;
            secondValue = 0;
            tmpCards = Arrays.copyOf(cards, cards.length);
        }
        return answer;
    }

    private int getOpenedCount(int next, int[] tmpCards){
        int cur;
        int count = 0;

        while ( true ) {
            if(tmpCards[next] == -1) {
                break;
            }
            cur = next;
            next = tmpCards[cur] - 1;
            tmpCards[cur] = -1;
            count++;
        }
        return count;
    }
}
