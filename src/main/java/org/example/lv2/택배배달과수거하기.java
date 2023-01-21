package org.example.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/150369*/
public class 택배배달과수거하기 {

    public long deliverLong(int cap, int n, int[] deliveries) {
        HashMap<Integer,Integer> deliver = new HashMap<>();
        long deliverL = 0;
        for(int i=0; i<n; i++) {
            deliver.put(i+1,deliveries[i]);
            if(n==i+1) {
                int s= cap-deliveries[i];
                deliver.replace(n,0);
                deliverL=deliverL+n;

                if(s>=deliveries[i-1]) {
                    s-=deliveries[i-1];
                    deliver.replace(i,0);

                    s=cap;
                    for(int j=n; j>0; j--){
                        if(deliver.get(j)!=0) {
                            s=cap-deliveries[j-1];
                            deliver.replace(j,0);
                            deliverL=deliverL+j;
                        }

                        if(s>=deliveries[j-1]) {
                            s-=deliveries[j-1];
                            deliver.replace(j,0);
                        }
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
