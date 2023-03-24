package org.example.baekjoon.test;

import java.util.Scanner;

public class 터렛 {

    static class Main{
        public static void  main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int r1 = sc.nextInt();

                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int r2 = sc.nextInt();

                System.out.println(tangent_point(x1,y1,r1,x2,y2,r2));
            }
        }
        public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2){
            int distance_pow = (int)(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));

            if(x1 == x2 && y1 == y2 && r1==r2) {
                return -1;
            }
            else if(distance_pow > Math.pow(r1+r2,2)) {
                return 0;
            }
            else if(distance_pow < Math.pow(r2 - r1, 2)) {
                return 0;
            } else if(distance_pow  == Math.pow(r1 + r2, 2)) {
                return 1;
            } else if (distance_pow == Math.pow(r2-r1,2)) {
                return 1;
            } else {
                return 2;
            }
        }
    }

}
