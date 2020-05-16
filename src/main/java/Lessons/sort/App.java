package Lessons.sort;

import java.util.Random;

public class App {
    private static int number;

    public static void setNumber(int n) {
        number = n;
    }

    public static int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] massiv = new int[50];
        int[] massiv2 = new int[massiv.length];
        System.out.println("Before sort:");
        for (int l = 0; l < massiv.length; l++) {
            massiv[l] = random.nextInt(150);
            massiv2[l] = massiv[l];
            System.out.println(massiv[l]);
        }
        int min;
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            min = massiv[i];
            for (int j = i; j < massiv.length; j++) {
                if (massiv[j] < min) {
                    min = massiv[j];
                    massiv[j] = massiv[i];
                    massiv[i] = min;
                    count++;
                }
            }
        }

        int count2 = 0;
        sort(massiv2, count2);
        System.out.println("After sort:");
        for (int i = 0; i < massiv2.length; i++) {
            System.out.println(massiv2[i]);
        }
        System.out.println("1)for my sort O= " + count);
        System.out.println("2)for bubble sort O = " + getNumber());
    }

    public static int[] sort(int[] arr, int count) {
        int tmp;
        boolean isSorted = true;
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k + 1]) {
                tmp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = tmp;
                isSorted = false;
                count++;
                setNumber(count);
            }
        }
        if (!isSorted) {
            sort(arr, count);
        }
        return arr;
    }


}
