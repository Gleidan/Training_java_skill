package com.savostikov.practical.ex06;

import java.util.Arrays;

public class RandomFromArray {

    private int[] values;
    private int[] weight;
    private int[] result;

    public RandomFromArray(int[] values, int[] weight) {
        this.values = values;
        this.weight = weight;

        int resultLength = 0;
        for (int temp : weight) {
            resultLength += temp;
        }

        result = new int[resultLength];
        int temp = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = weight[i]; j > 0; j--) {
                result[temp] = values[i];
                temp++;
            }
        }
    }

    public int getRandomValue() {
        int random = (int) (Math.random() * (result.length - 1));

        return result[random];
    }
}
