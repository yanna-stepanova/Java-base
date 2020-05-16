/*
Посчитать факториал числа от 1 до 64.
Например: факториал 5 = 1*2*3*4*5 = 120
*/
package HW.hw2;

import java.math.BigInteger;

public class hw2Task8 {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= 64; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of numbers is " + factorial);
    }
}

