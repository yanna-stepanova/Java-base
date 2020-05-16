/*
Даны два числа и параметр negative:
int a;
int b;
boolean negative;
Вернуть true если одно из чисел отрицательное. За исключением когда параметр negative
равен true, тогда нужно вернуть true только если оба числа отрицательные.
*/
package HW.hw2;
import java.util.Scanner;

public class hw2Task4 {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("First number: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("Second number: ");
            int b = scan.nextInt();
            System.out.print("Negative is 'true/false' : ");
            boolean negative = scan.nextBoolean();
            if (negative == false) {
                if (a < 0 || b < 0) {
                    System.out.println("true");
                }
            } else {
                if (a < 0 && b < 0) {
                    System.out.println("true");
                }
            }
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y") == true);
    }
}

