package org.example.algorithms.search;

public class BinarySearch {

    // далее жадные алгоритмы и динамическое программирование - см в том
    // числе и хабр + stepic задача про рюкзак
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
