package org.example.TC;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/155652*/
public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<String> box = new ArrayList<>();
        ArrayList<String > trash = new ArrayList<>();
        String[] l = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> asd = new ArrayList<>();
        Map<String, Integer> alphabet = new HashMap<>();
        StringBuilder m = new StringBuilder();
        Collections.addAll(asd, l);
        Collections.addAll(box, s.split(""));
        Collections.addAll(trash, skip.split(""));
        for(String j : trash) asd.remove(j);
        for(int i=0;  i<asd.size(); i++) alphabet.put(asd.get(i), i+1);
        for(String j : box) {
            if(alphabet.get(j)+index<asd.size()) {
                int x = alphabet.get(j)+index;
                for(Map.Entry<String, Integer> entry : alphabet.entrySet()) {
                 if(entry.getValue().equals(x)) {
                     String word = entry.getKey();
                     m.append(word);
                 }
                }
            } else {
                int x = alphabet.get(j)+index-asd.size();
                for (Map.Entry<String , Integer> entry : alphabet.entrySet()) {
                    if(entry.getValue().equals(x)) {
                        String word = entry.getKey();
                        m.append(word);
                    }
                }
            }
        }
        answer = m.toString();
        return answer;
    }

    public String solution2(String s, String skip, int index) {
        String answer = "";
        char[] sArr = s.toCharArray();

        for(int i=0; i<sArr.length; i++) {
            for(int j=0; j<index; j++) {
                do{
                    sArr[i]++;
                    if(sArr[i]>'z')
                        sArr[i]-=26;
                } while (skip.contains(String.valueOf(sArr[i])));
            }
        }
        answer = String.valueOf(sArr);
        return answer;
    }
}

