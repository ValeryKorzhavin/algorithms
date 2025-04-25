package org.example.algorithms.search;

public class Fibonacci {
    // далее как поменять числа местами без использования временной переменной inplace
    // реализовать деревья и графы
    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }

    public static void swap(int a, int b) {
        // a = 2 b = 3
        a = a + b; // a = 5 b = 3
        b = a - b; // a = 5 b = 2
        a = a - b; // a = 3
       //-----
        a = a ^ b; // a ^ b, b
        b = b ^ a; // a ^ b, a
        a = a ^ b; // b


        a ^= b;
        b ^= a;
        a ^= b;
    }

//    public static int fibRecursive(int n) {
//        if (n == 1 || n = 2) {
//            return 1;
//        }
//        int a = 1;
//        int b = 1;
//        for (int i = 0; i < n; i++) {
//            int tmp = b;
//            b = a + b;
//            a = tmp;
//        }
//
//        return b;
//    }
}
