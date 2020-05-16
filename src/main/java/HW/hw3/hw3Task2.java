/*
В массиве целых чисел заменить нулями отрицательные элементы.
 */
package HW.hw3;
import java.util.Arrays;

public class hw3Task2 {
    public static void main(String[] args) {
        int[] numbers = {1,-9, 5, 5, 6, -7, 3, 7, -2, 0}; //массив целых чисел
        System.out.println("Numers: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("Result: "  + Arrays.toString(numbers));
    }
}
