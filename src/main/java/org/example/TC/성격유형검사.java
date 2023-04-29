package org.example.TC;

import java.util.*;


/*https://school.programmers.co.kr/learn/courses/30/lessons/118666*/
public class 성격유형검사 {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> identity = new HashMap<>();
        String[][] type = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        StringBuilder answer = new StringBuilder();
        int k = 0;
        for (int c : choices) {
                if(c<4) {
                    identity.put(survey[k].split("")[0], identity.getOrDefault(survey[k].split("")[0], 0) + 4 - c);
                } else {
                    identity.put(survey[k].split("")[1], identity.getOrDefault(survey[k].split("")[1], 0) +  c - 4);
                }
                k++;
            }

        for(String[] t : type) {
            for(String key : t) identity.putIfAbsent(key, 0);
            if(identity.get(t[0])>=identity.get(t[1])) {
                answer.append(t[0]);
            } else {
                answer.append(t[1]);
            }
        }
        return answer.toString();
    }
}
//


