package HW.hw4;
/*
Написать 4 перегруженных метода. 1й принимает 2 аргумента типа int,
2й - 3 аргумента типа int и т.д. Без использования VarArgs
 */
import java.util.Scanner;

public class OverloadOfMethod {
    public static void main(String[] args) {
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
    public static int mult (int a, int b){
        return a*b;
    }

    public static int mult (int a, int b, int c){
        return a*b*c;
    }

    public static int mult (int a, int b, int c, int d){
        return a*b*c*d;
    }

    public static int mult (int a, int b, int c, int d, int f){
        return a*b*c*d*f;
    }
}
