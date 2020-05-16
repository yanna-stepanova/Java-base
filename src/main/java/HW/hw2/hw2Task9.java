/*
Даны два числа. Вывести диапазон чисел в порядке возрастания если первое число
меньше второго и в порядке убывание если первое число больше воторого.
Пример:
(1, 9) -> 1, 2, 3, 4, 5, 6, 7, 8, 9
(5, 2) -> 5, 4, 3, 2
*/
package HW.hw2;
import java.util.Scanner;

public class hw2Task9 {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("First number: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("Second number: ");
            int b = scan.nextInt();
            if (a < b){
                for (; a <= b; a++){
                    System.out.print(a + " ");
                }
            }
            else {
                for (; a >= b; a--){
                    System.out.print(a + " ");
                }
            }
            System.out.println();
            System.out.print("Continue? (y/n): ");
            answer = scan.next();
        } while (answer.equals("y") == true);
    }
}

