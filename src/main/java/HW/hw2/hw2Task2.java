/*
У нас есть громко говорящий попугай. Если он кричит с 7 часов утра до 20 часов - то ОК,
если вне этого диапазона - не ОК.
Пример:
Попугай кричит  Время      Результат
true           7:00-19:59   true
true           20:00-6.59   false
false          7:00-19:59   true
false          20:00-6.59   true
*/
package HW.hw2;

import java.time.LocalTime;
import java.util.Scanner;

public class hw2Task2 {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("Is a parrot screaming ('true/false') ?  ");
            Scanner scan = new Scanner(System.in);
            boolean noisy = scan.nextBoolean();
            System.out.print("What time is it now ('HH:MM')? ");
            LocalTime time = LocalTime.parse(scan.next());
            LocalTime limit1 = LocalTime.of(7,00);
            LocalTime limit2 = LocalTime.of(19,59);
            System.out.println(time.isAfter(limit2));
            System.out.println(time.isBefore(limit1));
            if (noisy == true) {
                if(time.isAfter(limit2)==true || time.isBefore(limit1)==true) {

                    System.out.println("It's not Ok");
                }
                else {
                    System.out.println("It's Ok");
                }
            }
            else {
                System.out.println("It's Ok");
            }
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y") == true);
    }
}

