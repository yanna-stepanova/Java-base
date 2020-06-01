package Lessons.math.big_number;
/*
Написать реализацию интерфейса BigNumber.
Класс должен быть изменяемым.
Класс должен быть потокобезопасным.
Класс должен работать с любыми числами, включая числа,
которые больше чем максимальное значение long.
 */

import java.math.BigDecimal;

public class AppBigNumber {
    public static void main(String[] args) {
        BigNumber bigNumber = new BigNumberImpl(BigDecimal.valueOf(234));
        bigNumber.increment(BigDecimal.valueOf(-5));
        System.out.println("Increment: " + bigNumber.toString());
        bigNumber.divide(BigDecimal.valueOf(2));
        System.out.println("Divide: " + bigNumber.toString());
        bigNumber.multiply(BigDecimal.valueOf(2));
        System.out.println("Multiply: " + bigNumber.toString());
    }
}
