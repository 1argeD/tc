package org.example.TC;

import java.util.Arrays;
import java.util.LinkedList;


public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        LinkedList<String> list = new LinkedList<>(Arrays.asList(participant));
        for(String com : completion) list.remove(com);
        return answer = String.join("",list);
    }
}
