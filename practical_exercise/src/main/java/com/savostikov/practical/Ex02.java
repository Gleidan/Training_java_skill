package com.savostikov.practical;

/*
    Реализуйте алгоритм сортировки пузырьком для сортировки массива
*/
public class Ex02 {

    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int temp : array) {
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
