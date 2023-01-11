package org.example.GreedyAlorithm;

import java.io.*;

public class 거스름돈 {
    /*
    * 당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다.
    * 손님에게 거슬러 주어야 할 돈이 N원일 때, 거슬러 주어야 할 동전의 최소 개수를 구하세요.
    * 단, 거슬러 줘야할 돈 N은 항상 10의 배수입니다.(즉, 거슬러주지 못할 경우 없음)
    * */

    public int solution(int n) {
        int answer = 0;
        int[] array = {500, 100, 50, 10};
        int k=0;
        for(int i=0; i<array.length; i++) {
            k = array[i];
            if(k==array[i]) {
                answer += n/k;
                n%=k;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        거스름돈 test = new 거스름돈();
        int n =1260;
        int answer = 6;
        int result = test.solution(n);

        if(answer==result) {
                System.out.print("해당 수식의 결과는"+result+"입니다");
                System.out.print(true);
            } else {
                System.out.print("해당 수식 결과는"+result+"입니다");
                System.out.print(false);
            }

    }

}
