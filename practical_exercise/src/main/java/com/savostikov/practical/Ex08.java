package com.savostikov.practical;

import java.util.Arrays;

public class Ex08 {

    public static void main(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array);

        bruteForce(array, 0.5);
        binarySearch(array, 0.5);
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

    }
}
