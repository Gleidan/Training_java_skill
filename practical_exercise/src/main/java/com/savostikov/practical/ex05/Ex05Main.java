package com.savostikov.practical.ex05;

/*
    Создайте класс, который описывает вектор (в трёхмерном пространстве).

    https://habr.com/ru/post/440436/
 */

public class Ex05Main {

    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].sub(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].getVectorLength());
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].scalarProduct(vectors[1]));
    }
}
