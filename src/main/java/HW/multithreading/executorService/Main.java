package HW.multithreading.executorService;
/*
Написать код, который считывает с консоли числа и запускает в отдельном потоке проверку:
является ли число простым. Если число простое, то вывести его в консоль - “number 11 is prime”.
Если ввести 0, то программа выведет в консоль “Finished”  и завершит работу.
 */

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        while (scanner.hasNext()) {
            int currentAnswer = scanner.nextInt();
            if (currentAnswer == 0) {
                break;
            } else {
                executorService.submit(new Task(currentAnswer));
            }
        }
        System.out.println("Finished!");
        executorService.shutdown();
    }
}
