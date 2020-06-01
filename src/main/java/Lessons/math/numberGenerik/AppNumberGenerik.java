package Lessons.math.numberGenerik;
/*
Написать игру для потоков:
В игре участвуют 4 потока.
Каждый из них независимо друг от друга берет случайные числа из “Числогенератора” и суммирует эти числа.
Числа генерируются “случайным” образом от 1 до 7 включительно.
У каждого потока есть 100 попыток получить число.
Поток набравший наибольшее количество очков побеждает.
Класс “Числогенератора” потокобезопасный.

 */
public class AppNumberGenerik {
    public static void main(String[] args) throws InterruptedException {
        ThreadNum thread1 = new ThreadNum();
        ThreadNum thread2 = new ThreadNum();
        ThreadNum thread3 = new ThreadNum();
        ThreadNum thread4 = new ThreadNum();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        System.out.println("max = " + Math.max( Math.max(thread1.getResult(), thread2.getResult()),
                                                Math.max(thread3.getResult(), thread4.getResult()) ) +" Winner!");
    }
}
