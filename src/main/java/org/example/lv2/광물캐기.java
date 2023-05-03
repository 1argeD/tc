package org.example.lv2;

/*https://school.programmers.co.kr/learn/courses/30/lessons/172927*/
public class 광물캐기 {
    public int solution(int[] picks, String[] minerals) {
        int res = 0;
        int k = 0;
        int cnt = 0;
        /*해당 코드는 곡괭이를 순서대로 사용하고 있음, 광물의 순서에 따라서 사용하는 곡괭이를 다른게 써야 최송 값을 구할 수 있는데,
        곡괭이를 순서대로 사용하여 입출력에는 문제가 없지만, 테스트 코드를 보면 에러가 발생함 내일 수정할 것*/
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
