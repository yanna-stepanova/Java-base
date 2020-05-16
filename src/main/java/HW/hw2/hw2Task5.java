/*
Вернуть true если заданное число кратно 3 или кратно 5 (делится без остатка).
Используйте % оператор.
*/
package HW.hw2;
import java.util.Scanner;

public class hw2Task5 {
    public static void main(String[] args) {
        String answer;
        do{
            System.out.print("Number: ");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            boolean result;
            if (i%3==0 || i%5==0){
                result = true;
            }
            else {
                result = false;
            }
            System.out.println("Result is " + result);
            System.out.print("One more time (y/n)? ");
            answer = scan.next();
        } while(answer.equals("y") == true);


    }


}

