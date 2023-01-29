package org.example.lv2;

import java.util.ArrayList;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        int[] sale = {10,20,30,40};
        ArrayList<int[]> per = new ArrayList<>();

        for(int i=0; i<users.length; i++){
            per.add(users[i]);
            int[] s = per.get(i);
            int sum = 0;
            int cnt = 0;
            for(int j=sale.length-1; j>=0;--j){
                if(s[0]>sale[sale.length-1]){
                    for(int k=emoticons.length-1;k>=0;--k){
                        sum += emoticons[k]-emoticons[k]*s[0]/100;
                    }
                }
            }
            if(sum>s[1]) {
                ++cnt;
                int j = sum;

                answer = new int[]{cnt, j};
            }
        }

        return answer;
    }
}
