package com.savostikov.practical.ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer, Double> tree = new BinaryTree<>();
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Double temp = Math.random();
            tree.add(i, temp);
            list.add(temp);
        }

        System.out.println(tree.get(789));
        System.out.println(list.get(789));
    }
}
