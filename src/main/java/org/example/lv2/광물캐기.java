package org.example.lv2;

/*https://school.programmers.co.kr/learn/courses/30/lessons/172927*/
public class 광물캐기 {
    public int solution(int[] picks, String[] minerals) {
        int res = 0;
        int k = 0;
        int cnt = 0;
        for (int mineral = 0; mineral < minerals.length; mineral++) {
            if (picks[k] != 0) {
                res += craft(k, picks[k], minerals[mineral]);
                cnt++;
                if (cnt%5==0) {
                    picks[k] --;
                    k++;
                    if (k == 3) {
                        return res;
                    }
                }
            } else {
                k++;
                mineral--;
            }
        }
        return res;
    }

    private int craft(int kind, int many, String mineral) {
        int res = 0;
        if (kind == 0 && many != 0) {
            res += 1;
        } else if (kind == 1 && many != 0) {
            if (mineral.equals("diamond")) {
                res += 5;
            } else {
                res += 1;
            }
        } else if (kind == 2 && many != 0) {
            if (mineral.equals("diamond")) {
                res += 25;
            } else if (mineral.equals("iron")) {
                res += 5;
            } else {
                res += 1;
            }
        } else {
            return res;
        }
        return res;
    }
}
