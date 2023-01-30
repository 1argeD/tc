package org.example.TC;

import java.util.ArrayList;
import static java.util.Collections.sort;
/*https://school.programmers.co.kr/learn/courses/30/lessons/135808?language=java*/
public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> group = new ArrayList<>();

        for(int i=0; i<score.length; ++i) s.add(score[i]);
        sort(s);
        while(s.size()!=0) {
            if(s.contains(k)){
                group.add(k);
                s.remove(s.get(s.size()-1));
            } else {
                k--;
            }
            if(group.size()==m) {
                int small = group.get(group.size() - 1);
                answer += small*m;
                group.removeAll(group);
            }
        }
        return answer;
    }

}
