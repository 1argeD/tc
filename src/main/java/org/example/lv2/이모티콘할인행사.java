package org.example.lv2;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int pay(ArrayList<Integer> data, int[] per, int[] emoticons , int sumPrice) {
        int answer = 0;
        for(int i = 0; data.size()>i; i++) {
            if (per >= data.get(i)[0]) {
            }
        }
        return answer;
    }

    public Map<Object, String> userCheck(Map<Object, String> users) {
        return users;
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] per = {10, 20, 30, 40};
        int sumPrice = 0;
        Map<Object, String>user = new HashMap<>();
        ArrayList<Integer> data = new ArrayList<>();
        for (int[] i : users) {
            data.add(i);
            user.put(i, "X");
        }
        pay(data, per, emoticons, sumPrice);



        return answer;
    }
}
