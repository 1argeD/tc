package org.example.GreedyAlorithm;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] a, int[] s) {
        int n = a.length;
        int m = s.length;
        int[] ans = new int[m];
        int pos = 0;

        for (int i = 0; i < m; i++) {
            int[] b = Arrays.copyOfRange(a, pos, pos + s[i]);
            int cnt = 0;

            for (int j = 0; j < b.length; j++) {
                for (int k = j + 2; k <= b.length; k++) {
                    int sum1 = sum(b, j + 1, k - 1);
                    int sum2 = sum(b, 0, j);
                    int sum3 = sum(b, k, b.length - 1);
                    if (sum1 == sum2 && sum2 == sum3) {
                        cnt++;
                    }
                }
            }

            ans[i] = cnt;
            pos += s[i];
        }

        return ans;
    }

    private int sum(int[] arr, int l, int r) {
        int res = 0;
        for (int i = l; i <= r; i++) {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1,1,1,1,1,1,2,5,8,2,1,1,4,8,8,8,12,6,6}; // 다시 12로 변경
        int[] s = {4,3,1,5,6};
        int[] ans = sol.solution(a, s);
        System.out.println(Arrays.toString(ans));
    }
}
