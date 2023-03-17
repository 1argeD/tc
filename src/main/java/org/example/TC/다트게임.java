package org.example.TC;

import static java.lang.Double.*;
/*https://school.programmers.co.kr/learn/courses/30/lessons/17682*/
public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] dartGame = dartResult.split("");
        int[] dartScore = new int[3];

        int k =0;

        for(int i = 0; i<dartGame.length; i++) {
            if(dartGame[i].matches("[0-9]")) {
                k++;
                dartScore[k] = (int) parseDouble(dartGame[i]);
                if(dartGame[i+1].matches("[0-9]")) {
                    dartScore[k] *= 10;
                    i++;
                }
            }
            switch (dartGame[i]) {
                case "S":
                    dartScore[k] = (int) Math.pow(dartScore[k], 1);
                    break;
                case "D":
                    dartScore[k] = (int) Math.pow(dartScore[k], 2);
                    break;
                case "T":
                    dartScore[k] = (int) Math.pow(dartScore[k], 3);
                    break;
                case "*" :
                    dartScore[k] *= 2;
                    if(k>0) dartScore[k-1] *=2;
                    break;
                case "#" :
                    dartScore[k] *=-1;
                    break;
            }
        }
        for(int s : dartScore) {
            answer += s;
        }
        return answer;
    }
}
