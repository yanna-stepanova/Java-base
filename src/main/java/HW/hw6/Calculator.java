package HW.hw6;
/*
Написать калькулятор (с использованием ООП) – программа, которая на входе получает
два целых числа (число А и число В) и операцию, выполняет арифметическую операцию
(«+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление) и выводит результат в
консоль. Для каждой операции использовать отдельный Класс.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input two numbers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            Operation operation = null;
            System.out.println("Choose the operation with them: '+' add, '-' sub, '*' mul, '/' div. ");
            switch (scan.next()) {
                case "add":
                    operation = new Plus();

                    break;
                case "sub":
                    operation = new Minus();

                    break;
                case "mul":
                    operation = new Multiplication();

                    break;
                case "div":
                    operation = new Division();

                    break;
                default:
                    System.out.println("Incorrect choice :(");
            }
            System.out.println("Result is " + operation.act(a,b));
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y"));

    }
}
