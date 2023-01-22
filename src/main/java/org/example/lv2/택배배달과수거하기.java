package org.example.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150369*/
public class 택배배달과수거하기 {

    public long deliverLong(int cap, int n, int[] deliveries) {
        HashMap<Integer,Integer> deliver = new HashMap<>();
        long deliverL = 0;
        int k=0;
        for(int i=0; i<n; i++) {
            deliver.put(i,deliveries[i]);
        }
        for(int i=n; i>-1; i--) {
            if(i!=0&&i!=1&&deliver.get(i-1)!=0) {
                k=cap-deliveries[i-1];
                deliver.replace(i-1,0);
                deliverL=deliverL+i;
                if(k>deliveries[i-2]) {
                    while (k==0) {
                        k-=deliveries[i-2];
                        deliverL=deliverL+i-2L;
                    }
                }
            }
        }
        return deliverL;
    }

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = -1;
        long deliver = deliverLong(cap, n, deliveries);
        long pickup = deliverLong(cap, n, pickups);

        answer = deliver+pickup;
        return answer;
    }
}
