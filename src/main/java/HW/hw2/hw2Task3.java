/*
Даны два числа, вывести true если одно из чисел равно 10 или их сумма равна 10.
*/
package HW.hw2;
import java.util.Scanner;

public class hw2Task3 {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("First number: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("Second number: ");
            int b = scan.nextInt();
            int sum = a + b;
            boolean result = (sum == 10 || a == 10 || b == 10) ? true : false;
            System.out.println("Result: " + result + " (" + sum + ")");
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y") == true);
    }
}

