package Lessons.collections.list;
/*
Создать список Integer и назвать его numbers, добавить в него несколько
элементов.
Создать Класс NumberUtils, у которого есть след.методы:
- getSum(List<Integer> numbers) - считает сумму чисел;
- multiplyOddNumber(List<Integer> numbers) - находит нечетные числа и умножает на 2.
 */

import java.util.ArrayList;
import java.util.List;

public class AppNumber {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(8);
        integers.add(4);
        integers.add(19);
        integers.add(0);
        integers.add(7);
        integers.add(6);
        NumberUtils numberUtils = new NumberUtils();
        System.out.println("Sum is " + numberUtils.getSum(integers));
        numberUtils.multiplyOddNumber(integers);
        System.out.println(integers);
    }
}
