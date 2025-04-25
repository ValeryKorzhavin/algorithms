package org.example.algorithms.lis;

import java.util.Arrays;

import static java.util.Collections.nCopies;

public class LongestIncreasingSubsequence {

    public static int lis(int[] arr) {
        int n = arr.length;
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, d[i]);
        }

        int k = ans;
        int prev = Integer.MAX_VALUE;
        int index = k - 1;
        int[] sequence = new int[k];
        for (int j = n - 1; j >= 0; j--) {
            if (d[j] == k && arr[j] < prev) {
                sequence[index] = arr[j];
                prev = sequence[index];
                index--;
                k--;
            }
        }
        System.out.println(Arrays.toString(sequence));
        return ans;
    }
}
