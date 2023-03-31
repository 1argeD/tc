package org.example.baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 피보나치 {
    static class  Main{
        static Integer[][] dp = new Integer[41][2];

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(bf.readLine());
            while(T-- > 0) {
                int n = Integer.parseInt(bf.readLine());
                fibonacci2(n);
                System.out.println(dp[n][0] + " "+ dp[n][1]);
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

        public static Integer[] fibonacci2(int n) {
            if (dp[n][0] != null || dp[n][1] != null) {
                return dp[n];
            }
            dp[0][0] = 1;
            dp[1][0] = 0;
            dp[1][1] = 1;
            dp[0][1] = 0;

            for (int o = 2; o <= n; o++) {
                dp[o][0] = fibonacci2(o - 1)[0] + fibonacci2(o - 2)[0];
                dp[o][1] = fibonacci2(o - 1)[1] + fibonacci2(o - 2)[1];
            }
            return dp[n];
        }
    }
}
