package com.savostikov.practical.ex06;

/*
    Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
    Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
    Пример:
    Дан массив [1, 2, 3], и массив весов [1, 2, 10].
    В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».

    https://habr.com/ru/post/440436/
 */
public class Ex06Main {

    public static void main(String[] args) {
        RandomFromArray random = new RandomFromArray(new int[]{1, 2, 3}, new int[]{1, 3, 10});

        System.out.println(random.getRandomValue());
    }
}
