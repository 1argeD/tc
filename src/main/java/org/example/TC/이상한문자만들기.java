package org.example.TC;

import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12930*/
public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] k = s.split("");
        int idx=0;
        for(int i=0; i<k.length; i++) {
            if(k[i].equals(" ")) {
                idx = 0;
            } else  if(idx % 2==0) {
                k[i]=k[i].toUpperCase();
                idx++;
            } else if(idx % 2!=0) {
                k[i]=k[i].toLowerCase();
                idx++;
            }
            answer.append(k[i]);
        }
        return answer.toString();
    }
}
