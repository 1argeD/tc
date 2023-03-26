package org.example.baekjoon.test;

import java.util.Scanner;

public class 피보나치 {
    static class  Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T-- > 0) {
                int n = sc.nextInt();
                int[] count = {0, 0};
                fibonacci(n, count);
                System.out.println(count[0] + " "+ count[1]);
            }
        }

        public static int fibonacci(int n, int[] count) {
            if(n==0) {
                count[0]++;
                return 0;
            } else if (n==1) {
                count[1]++;
                return 1;
            } else {
                return fibonacci(n-1, count) + fibonacci(n-2, count);
            }
        }
    }
}
