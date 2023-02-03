package org.example.lv2;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int pay(int[] data, int[] per, int[] emotiocons) {
        int answer = 0;
        int p =0;
        for(int i : per) {
            if(data[0] <= i) {
                for(int j = 0; emotiocons.length>j; j++){
                    p =emotiocons[j] - emotiocons[j]/100*i;
                    p+=p;
                    if(p>data[1]) {
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public Map<Object, String> userCheck(Map<Object, String> users, Stack data) {
    for(int i = 0;  users.size()>i; i++) {
        if(data.get(i) == users.get(i)) {
            users.replace(data.get(i),"O");
        }
    }
    return users;
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] per = {10, 20, 30, 40};
        Map<Object, String> user = new HashMap();
        Stack<int[]> data = new Stack<>();
        data.addAll(Arrays.asList(users));
        for (int[] i : data) {
            user.put(i, "X");
        }
        int cnt = 0;
        int sum = 0;
        int p = 0;
        for(int i=0; data.size()>i; i++) {
            pay(data.get(i), per, emoticons);
        }
        int count = 0;
        for (int j = 0; user.size() > j; j++) {
            if (user.get(j).contains("O")) {
                count++;
            }
        }
        answer = new int[]{count, p};
        return answer;
    }
    }
