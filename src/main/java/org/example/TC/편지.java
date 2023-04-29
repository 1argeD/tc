package org.example.TC;

import java.util.ArrayList;
import java.util.Arrays;

public class 편지 {
    public int solution(String message) {
        int answer = 0;
        ArrayList<String> count = new ArrayList<>(Arrays.asList(message.split("")).subList(0, message.length()));
        answer = count.size()*2;
        return answer;
    }
}
