/*
Даны два числа, нужно вывести в консоль их сумму,
но если числа одинаковые - вывести их произведение.
*/

package HW.hw2;

import java.util.Scanner;

public class hw2Task1 {
    public static void main(String[] args) {
        int sum = 0;
        String answer;
        do {
            System.out.print("First number: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("Second number: ");
            int b = scan.nextInt();
            if (a == b) {
                sum = a * b;
            } else {
                sum = a + b;
            }
            System.out.println("Result: " + sum);
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y"));
    }


}

