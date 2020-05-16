package HW.hw4;
/*
Написать 4 перегруженных метода. 1й принимает 2 аргумента типа int,
2й - 3 аргумента типа int и т.д. C использованием VarArgs
 */
import java.util.Scanner;

public class OverloadOfMethod2 {
    public static void main(String[] args) {
        System.out.println(sum("Zero"));
        System.out.print("Введите через пробел 2 числа: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Перегрузка для 2х аргументов: " + mult(scan.nextInt(),scan.nextInt()));
        System.out.print("Введите через пробел 3 числа: ");
        System.out.println("Перегрузка для 3х аргументов: " + mult(scan.nextInt(),scan.nextInt(), scan.nextInt()));
        System.out.print("Введите через пробел 4 числа: ");
        System.out.println("Перегрузка для 4х аргументов: " + mult(scan.nextInt(),scan.nextInt(), scan.nextInt(), scan.nextInt()));
        System.out.print("Введите через пробел 5 чисел: ");
        System.out.println("Перегрузка для 5и аргументов: " + mult(scan.nextInt(),scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));

    }

    public static int sum (String send, int... a){
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum += a[i];
        }
        System.out.println(send);
        return sum;
    }

    public static int mult (int... args ){
        int result = 1;
        for (int i = 0; i< args.length; i++){
            result *= args[i];
        }
     return result;
    }
}
