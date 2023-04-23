package org.example.lv2;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150368*/
public class 이모티콘할인행사 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answr = {};
        int[] per = {10,20,30,40};
        int[] userDC = new int[users.length];
        int[] userPrice = new int[users.length];
        int[] situation = new int[0];

        int x=0, y=0;
        int price=0;

        for(int[] DCPer : users) {
            userDC[x] = DCPer[0];
            userPrice[x] = DCPer[1];
            x++;
        }

        for(int p : per) {
            for (int k=0; k<userDC.length; k++) {
                if (p >= userDC[k]) {
                    situation = BuyEmoticon(k, userPrice, emoticons, p);
                    y = situation[1] += situation[1];
                }
            }
        }
        return new int[] {situation[0], y};
    }

    private static int[] BuyEmoticon(int k, int[] user, int[] emoticons, int p) {
        int price=0;
        int plus=0;
        for(int emoticon : emoticons) {
            price += emoticon-emoticon%p;
            if(price>user[k]) {
                plus++;
                return new int[] {plus, 0};
            }
        }
        return new int[] {0, price};
    }
}
