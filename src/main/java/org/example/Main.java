package org.example;

import org.example.algorithms.graph.Graph;
import org.example.algorithms.lis.LongestIncreasingSubsequence;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.logging.Logger;

import static org.example.algorithms.lis.LongestIncreasingSubsequence.lis;
import static org.example.algorithms.search.BinarySearch.binarySearch;
import static org.example.algorithms.search.Fibonacci.fib;
import static org.example.algorithms.search.Knapack.knapack;
import static org.example.algorithms.search.Knapack.knapack2;
import static org.example.algorithms.search.Knapack.maxProfit;

public class Main {

    public static class PairComarator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }

    public static void main(String[] args) {
//        PriorityQueue
//        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        System.out.println(binarySearch(arr, 0));
        // 0 1 1 2 3 5 8 13
        // 0 1 2 3 4 5 6 7
//        Comparator<String>
        System.out.println(fib(40));
        int[] arr = { 7, 2, 1, 3, 8, 4, 9, 1, 2, 6, 5, 9, 3, 8, 1 };
//        System.out.println(lis(arr))  ;

//        int[] weights = { 1, 3, 4, 5 };
//        int[] values = { 1, 4, 5, 7 };
//        int capacity = 7;
//        int[] weights = { 6, 3, 4, 2 };
//        int[] values = { 30, 14, 16, 9 };
//        int capacity = 10;
//        System.out.println(knapack(weights, values, capacity));
        int[] values = { 1, 4, 8 };
        int capacity = 10;
        System.out.println(knapack2(values, capacity));
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
    }
}