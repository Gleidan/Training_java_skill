package com.savostikov.practical;

import java.util.Arrays;

/*
    Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
    Используйте перебор и двоичный поиск для решения этой задачи.
    Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).

    https://habr.com/ru/post/440436/
 */

public class Ex08 {

    public static void main(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array);

        long time = System.currentTimeMillis();

        bruteForce(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        binarySearch(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void bruteForce(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("index: " + i);
                break;
            }
        }
    }

    public static void binarySearch(double[] array, double value) {
        binarySearchRecursive(array, value, 0, array.length);
    }

    public static void binarySearchRecursive(double[] array, double value, int first, int last) {
        int mid = (first + last) / 2;

        if (last < first) {
            return;
        }

        if (value == array[mid]) {
            System.out.println("index: " + mid);
        } else if (value < array[mid]) {
            binarySearchRecursive(array, value, first, mid - 1);
        } else {
            binarySearchRecursive(array, value, mid + 2, last);
        }
    }
}
