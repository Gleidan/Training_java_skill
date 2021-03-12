package com.savostikov.practical.ex07;

/*
    Реализовать связанный список

    https://habr.com/ru/post/440436/
 */

public class Ex07Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(2));
        System.out.println("size: " + list.size());
        list.remove(2);
        System.out.println(list.get(2));
        System.out.println("size: " + list.size());

        MyList<String> stringList = new MyList<String>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        stringList.add("I");
        stringList.add("Love");

        System.out.println(stringList.get(2));
        System.out.println("size: " + stringList.size());
        stringList.remove(2);
        System.out.println(stringList.get(2));
        System.out.println("size: " + stringList.size());
    }
}
