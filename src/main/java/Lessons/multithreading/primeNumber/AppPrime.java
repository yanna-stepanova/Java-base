package Lessons.multithreading.primeNumber;
/*
Написать программу, которая выполняет поиск простых чисел в
указанном диапазоне используя несколько потоков.
 */
import java.util.ArrayList;
import java.util.List;

public class AppPrime {
    public static void main(String[] args) throws InterruptedException {
        PrimeNumber t1 = new PrimeNumber(1, 50000);
        PrimeNumber t2 = new PrimeNumber(50001, 100000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        List<Integer> allPrimeNumbers = new ArrayList<>();
        allPrimeNumbers.addAll(t1.getNumbers());
        allPrimeNumbers.addAll(t2.getNumbers());
        System.out.println(allPrimeNumbers);
    }
}
