package org.example.TC;

import java.util.Map;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120910*/
public class 세균증식 {
    /*기존 답안*/
    /* public int solution(int n, int t) {
         for (int i =0; i<=t; i++) {
             n*=2;
         }
         return n;
    } */

    /*다른 답안*/
    public int solution(int n, int t) {
        /*Math 클래스는 다양한 메소드를 가지고 있는데,
        그중에서 pow()메소드는 y의 거듭제곱에 대한 x의 값을 출력하는 메소드이다
        답의 경우 2의 t승을 출력함.
        .*/
        return n * (int) Math.pow(2, t);
    }
}
