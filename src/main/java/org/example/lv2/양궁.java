package org.example.lv2;

import java.util.ArrayList;
import java.util.LinkedList;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92342*/
public class 양궁 {
    public int[] solution(int n,int[] info) {
        LinkedList<Integer> lionArrow = new LinkedList<>();
        int apeach = 0;
        int lion = 0;

        for(int i=0; i<11;i++) lionArrow.add(0);

        int k =1;

        int[] answer = Arrow(apeach, lion, lionArrow, k, n, info);
        return answer;
    }

    public int[] Arrow(int apeach, int lion, LinkedList<Integer> lionArrow, int k,int n, int[] info) {
        int[] target = {10,9,8,7,6,5,4,3,2,1,0};

        for(int i=0; i<target.length; i++) {
            for(int j=0; j<info.length; j++) {
                if(lionArrow.get(j)<info[j]) {
                    apeach += target[i];
                    n--;
                   lionArrow.remove(lionArrow.get(j));
                   lionArrow.addFirst(k++);
                    if(lionArrow.get(j)>info[j]) {
                        lion+=target[i];
                        apeach-=target[j];
                        k=0;
                    }
                    if(n!=0&&apeach>lion) {
                        Arrow(apeach, lion,  lionArrow,  k, n, info);
                    } else if(n==0&& apeach>=lion) {
                        return new int[]{-1};
                    }
                }
            }
        }
        return new int[]{-1};
    }
}
