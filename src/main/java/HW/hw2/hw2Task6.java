/*
Даны две температуры, если одна из температур ниже 0, а другая выше 120,
то вернуть true.
(120, -1) → true
(-1, 120) → true
(2, 120) → false
*/
package HW.hw2;
import java.util.Scanner;

public class hw2Task6 {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("First temperature: ");
            Scanner scan = new Scanner(System.in);
            int temp1 = scan.nextInt();
            System.out.print("Second temperature: ");
            int temp2 = scan.nextInt();
            boolean result;
            if (temp1 < 0 && temp2 >= 120) {
                result = true;
            } else {
                if (temp2 < 0 && temp1 >= 120) {
                    result = true;
                } else {
                    result = false;
                }
            }
            System.out.println("Result is " + result);
            System.out.print("One more time (y/n)? ");
            answer = scan.next();
        } while (answer.equals("y") == true);
    }
}

