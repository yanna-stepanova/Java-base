package Lessons.multithreading;

/*
Написать класс, который наследуется от класса Thread.
Конструктор этого класса должен принимать два числа и
выводить в консоль все числа в этом диапазоне.
 */

public class AppThread {
    public static void main(String[] args) {
        Thread numbersThread = new NumbersThread(4, 400);
        Thread numbersThread2 = new NumbersThread(100, 200);
        numbersThread.start();
        numbersThread2.start();
    }
}
