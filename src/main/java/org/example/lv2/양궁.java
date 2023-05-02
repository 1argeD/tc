package org.example.lv2;

import java.util.Arrays;
import java.util.stream.IntStream;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92342*/
public class 양궁 {
    public int[] solution(int n,int[] info) {
      int[] lionArrow = new int[11];
        int apeach = 0;
        int lion = 0;
        for(int i=0; i<11;i++) lionArrow[i]=0;
        int k =0;

        int[] answer = Arrow(apeach, lion, lionArrow, k, n, info);
        return answer;
    }

    public int[] Arrow(int apeach, int lion,int[] lionArrow, int k,int n, int[] info) {
        int cnt=0;
        int max =0;

        for(int i = 0; i<info.length; i++) {
            if(info[i]>lionArrow[i]) {
                lionArrow[i]=info[i]+1;
                n-=info[i]+1;
                if(n<0) {
                    lionArrow[i]-=info[i]+1;
                    break;
                }
            }
        }
        for(int i=10; i>=0; i--) {
            if(lionArrow[k]!=info[k]&&lionArrow[k]>info[k]){
                lion+=i;
            } else if(info[k]>lionArrow[k]){
                apeach+=i;
            }
            k++;
        }

        if(lion>apeach) {
            return lionArrow;
        } else{
            return new int[]{-1};
        }
    }
}
