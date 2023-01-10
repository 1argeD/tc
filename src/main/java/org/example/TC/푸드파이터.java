package org.example.TC;

public class 푸드파이터 {
    public String solution(int[] food) {
        StringBuilder an = new StringBuilder();
        for(int i =1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                an.append(i);
            }
        }
        String answer = an.toString()+"0"+ an.reverse().toString();
        return answer;
    }
    }
