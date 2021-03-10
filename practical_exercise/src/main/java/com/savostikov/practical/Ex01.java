package com.savostikov.practical;

/*
    Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

    Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

    https://habr.com/ru/post/440436/
 */

public class Ex01 {

    public static void main(String[] args) {
        double[] array = new double[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double min = array[0];
        double max = array[0];
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            average += array[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average / array.length);
    }
}
