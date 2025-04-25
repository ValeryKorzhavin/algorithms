package org.example.algorithms.search;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Knapack {
    
    public static int knapack(int[] weights, int[] values, int capacity) {
        int[][] d = new int[weights.length + 1][capacity + 1];

        for (int i = 1; i < values.length + 1; i++) {
            for (int w = 1; w < capacity + 1; w++) {
                d[i][w] = d[i - 1][w];
                if (weights[i - 1] <= w) {
                    d[i][w] = Math.max(d[i - 1][w], d[i - 1][w - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        for (int i = 0; i < weights.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.print("\n");
        }

        return d[weights.length][capacity];
    }

    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] free = new int[n];
        int[] hold = new int[n];
        hold[0] = -prices[0];

        for (int i = 1; i < n; i++) {
            hold[i] = Math.max(hold[i - 1], free[i - 1] - prices[i]);
            free[i] = Math.max(free[i - 1], hold[i - 1] + prices[i] - fee);
            System.out.println(hold[i]);
//            System.out.println([i]);
        }
        // fee = 2
        //      [  1, 3, 2, 8, 4, 9 ]
        // hold [ -1, 0, 0, 0, 0, 0 ]
        // free [  0, 0, 0, 0, 0, 0 ]
        return free[n - 1];
    }

    @SneakyThrows
    public static int knapack2(int[] arr, int capacity) {




        int n = arr.length;
        int[][] d = new int[n + 1][capacity + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int w = 1; w < capacity + 1; w++) {
                d[i][w] = d[i - 1][w];
                if (arr[i - 1] <= w) {
                    d[i][w] = Math.max(d[i - 1][w], d[i - 1][w - arr[i - 1]] + arr[i - 1]);
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.print("\n");
        }
        return d[n][capacity];
    }
}
