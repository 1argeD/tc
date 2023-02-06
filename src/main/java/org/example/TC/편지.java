package org.example.TC;

import java.util.ArrayList;

public class 편지 {
    public int solution(String message) {
        int answer = 0;
        ArrayList<String> count = new ArrayList<>();
        for(int i=0; message.length()>i; i++) {
            count.add(message.split("")[i]);
        }
        answer = count.size()*2;
        return answer;
    }
}
