package com.savostikov.practical;

/*
    Найдите корень уравнения

    cos(x5)+x4−345.3∗x−23=0

    на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
    Используйте для этого метод деления отрезка пополам (и рекурсию).

    https://habr.com/ru/post/440436/
 */

public class Ex09 {

    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }

    private static double func(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    private static double solve(double start, double end) {
        double x = start + (end - start) / 2;
        if (x == end || x == start) {
            return x;
        }
        if (func(start) * func(x) > 0) {
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }
}
