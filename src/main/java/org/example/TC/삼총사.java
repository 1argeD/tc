package org.example.TC;

/*https://school.programmers.co.kr/learn/courses/30/lessons/131705*/
public class 삼총사 {
    public int solution(int[] number) {
        int count = 0;
        for(int i = 0; i<number.length; i++ ) {
            for(int j=0; j<i; j++) {
                for(int k=0; k<j; k++) {
                    if(number[i]+number[j] == -1*number[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
