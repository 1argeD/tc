package org.example.TC;

import java.util.*;


/*https://school.programmers.co.kr/learn/courses/30/lessons/118666*/
public class 성격유형검사 {
    public String solution(String[] survey, int[] choices) {
        StringBuffer answer = new StringBuffer();
        String[][] type = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        HashMap<String, Integer> testResult = new HashMap<>();
        int k = 0;
        for (int s : choices) {
            if (s < 4) {
                testResult.put(survey[k].split("")[0], testResult.getOrDefault(survey[k].split("")[0], 0) + 4 - s);
            } else {
                testResult.put(survey[k].split("")[1], testResult.getOrDefault(survey[k].split("")[1], 0) + s - 4);
            }
            k++;
        }
            for (String[] t : type) {
                for (String value : t) {
                    testResult.putIfAbsent(value, 0);
                }
                if (testResult.get(t[0]) >= testResult.get(t[1])) {
                    answer.append(t[0]);
                } else if (testResult.get(t[0]) < testResult.get(t[1])) {
                    answer.append(t[1]);
                }
            }
        return answer.toString();
    }
}
//


