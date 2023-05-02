package org.example.lv2;

import java.util.Arrays;
import java.util.stream.IntStream;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92342*/
public class 양궁 {
    public int[] solution(int n,int[] info) {
      int[] lionArrow = new int[11];
        int apeach = 0;
        int lion = 0;
        int cnt = 0;

        int[] answer = Arrow(apeach, lion, lionArrow, n, info, cnt);
        return answer;
    }

    public int[] Arrow(int apeach, int lion, int[] lionArrow, int n, int[] info, int cnt) {
        if (cnt == n) {
            int max = 0;

            for (int i = 0; i < 11; i++) {
                if (lionArrow[i] != 0 || info[i] != 0) {
                    if (lionArrow[i] > info[i]) {
                        lion += 10 - i;
                    } else {
                        apeach += 10 - i;
                    }
                }
            }

            if (lion > apeach) {
                if (lion - apeach >= max) {
                    lionArrow.clone();
                    max = lion - apeach;
                }
                return lionArrow;
            }
        }
        for (int i = 0; i < lionArrow.length && lionArrow[i] <= info[i]; i++) {
            lionArrow[i]++;
            Arrow(apeach, lion, lionArrow, n, info, cnt + 1);
            lionArrow[i]--;
        }
        return lionArrow;
    }
    }
