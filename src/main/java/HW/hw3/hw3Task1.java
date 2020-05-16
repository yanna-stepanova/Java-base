/*
В массиве целых чисел поменять местами
максимальный отрицательный элемент и минимальный положительный.
 */
package HW.hw3;
import java.util.Arrays;

public class hw3Task1 {
    public static void main(String[] args) {
        int[] numbers = {1,-9, 5, 5, 6, -7, 3, 7, -2, 0}; //массив целых чисел
        int max_negative = 0;
        int maxPos = 0, minPos = 0;
        int min_positive = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < max_negative){
                max_negative = numbers[i];
                maxPos = i;
            }
            else {
                min_positive = numbers[i];
                minPos = i;
            }
        }
        System.out.println("Numers: " + Arrays.toString(numbers));
        numbers[maxPos] = min_positive;
        numbers[minPos] = max_negative;
        System.out.println("Result: " + Arrays.toString(numbers));
    }
}
