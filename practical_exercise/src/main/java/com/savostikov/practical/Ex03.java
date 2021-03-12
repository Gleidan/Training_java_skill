package com.savostikov.practical;

/*
    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

    https://habr.com/ru/post/440436/
 */

public class Ex03 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
