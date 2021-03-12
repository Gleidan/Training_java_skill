package com.savostikov.practical;

import java.util.Arrays;

/*
    Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).

    https://habr.com/ru/post/440436/
 */

public class Ex04 {

    public static void main(String[] args) {
        int[] array = {23, 17, 41, 23, 21, 21, 21, 1, 9, 10, 22, 21, 99, 23, 25, 67, 99};
        int target = 21;
        int targetCount = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                targetCount++;
            } else {
                array[i - targetCount] = array[i];
            }
        }

        int[] correctArray = Arrays.copyOf(array, array.length - targetCount);
        System.out.println(Arrays.toString(correctArray));
    }
}
