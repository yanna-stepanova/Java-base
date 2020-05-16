/*
Вывести сумму всех четных чисел от 0 до 112 включительно.
*/
package HW.hw2;
public class hw2Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 112; i++){
            if (i%2 != 0){
                continue;
            }
            sum += i;
        }
        System.out.println("Sum of even numbers is " + sum);
    }
}


