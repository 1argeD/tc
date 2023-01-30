package org.example.lv2;

import java.util.ArrayList;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] per = {10,20,30,40};
        int cnt = 0;
        int sum = 0;
        int dex = 0;
        int[] s = {};

        for (int[] user : users) {
            s = user;
            for(int j : per) {
                for(int k = emoticons.length-1; k>=0; --k ) {
                    dex = emoticons[k]-emoticons[k]*j/100;
                    if(s[0]<=j){
                        sum+=dex;
                    }
                    if(s[0] <=j && s[1]<sum) {
                        cnt++;
                        sum-=dex;
                        break;
                    }
                }
            }
        }
       answer = new int[] {cnt,sum};
        return answer;
    }
    }
