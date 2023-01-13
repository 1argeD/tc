package org.example.GreedyAlorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌으 때,
왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에
'x' 혹은 '+' 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요.
단, +보다 x를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서 부터 순서대로 이루어진다고 가정합니다.
예를 들어 02984라는 문자열로 만들 수 있는 가장 큰 수는 ((((0 + 2) x 9) x 8) x 4) = 576입니다.
또한 만들어질 수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어집니다.
(프로그래밍 언어에서 정수가 가질 수 있는 최대 범위가 약 -2147000000 ~ 2147000000까지 이므로)*/
public class 곱하기혹은더하기 {
    public static int solution(String n) {
        int result = 0;
        for(int i=0; i<n.length(); i++) {
            int k = Integer.parseInt(n.substring(i, i+1));
            if(result == 0||k==0||result==1||k==1) {
                result +=k;
            } else {
                result *= k;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String n = "02984";
        int result = solution(n);
        int answer = 576;
        if(result == answer) {
            System.out.print(true);
            System.out.print(result);
        } else {
            System.out.print(false);
            System.out.print(result);
        }
    }
    }
