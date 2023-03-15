package org.example.TC;

import static java.lang.Double.*;
/*https://school.programmers.co.kr/learn/courses/30/lessons/17682*/
public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] gameResult = dartResult.split("");
        int[] gameScore = new int[3];
        int dex = -1;
        for(int i=0; i<gameResult.length; i++) {
            if(gameResult[i].matches("[0-9]")) {
                dex++;
                gameScore[dex] = (int) parseDouble(gameResult[i]);
                if(gameResult[i+1].matches("[0-9]")) {
                    gameScore[dex] = 10;
                    i++;
                }
            }
            switch (gameResult[i]) {
                case "S":
                    gameScore[dex] = (int) Math.pow(gameScore[dex], 1);
                    break;
                case "D":
                    gameScore[dex] = (int) Math.pow(gameScore[dex], 2);
                    break;
                case "T":
                    gameScore[dex] = (int) Math.pow(gameScore[dex], 3);
                    break;
                case "*":
                    gameScore[dex]*=2;
                    if(dex>0) gameScore[dex-1]*=2;
                    break;
                case "#":
                    gameScore[dex]*=-1;
                    break;
            }
        }
        for(int s : gameScore) {
            answer+=s;
        }
        return answer;
    }
}
// drat = {1,S,2,D,*,3,T}
