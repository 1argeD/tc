package org.example.lv2;

import java.util.ArrayList;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] sale = {10,20,30,40};
        int sum = 0;
        int dex = 0;
        int cnt = 0;

        int ground =0;
        ArrayList<int[]> per = new ArrayList<>();

        for(int i=0; i<users.length; i++){
            per.add(users[i]);//int[][] 형 int[]로 변환
            int[] s = per.get(i);
            for(int j : sale) {
                if(s[0]<=j){
                    for (int emoticon : emoticons) {
                        dex = emoticon - emoticon / 100 * j; //할인율 대로 이모티콘 순서대로 할인하기
                        sum += dex;  //구매한 임티 값 총합
                        if(sum>s[1]) {
                            cnt++;
                            sum=0;
                        }
                    }
                }
            }
            ground+=sum;
            answer = new int[] {cnt, ground};
            }
        return answer;
    }
    }
