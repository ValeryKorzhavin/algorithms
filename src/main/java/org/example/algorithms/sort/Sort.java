package org.example.algorithms.sort;

public class Sort {


    // когда готовиться к собеседованиям по теории ?
    // в какое время дня
    // и когда делать рабочие задачи ?
    //  У меня есть самое утро и время до дейлика + вечер
    //  Убраться дома - далее готовиться к теории дома на кухне с 5 до 7 утра учить теорию (а бегать когда?)
    //  бегать потом когда пройдешь собесы - но надо же продолжать готовиться

    // Разобраться в чем разница и как реализовать эти подходы
    // 1 Динамическое программирование
    // 2 Жадные алгоритмы
    // 3 Разделяй и властвуй


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        // TODO document why this method is empty
    }

    public static void insertionSort(int[] arr) {
        // TODO document why this method is empty
    }
}
