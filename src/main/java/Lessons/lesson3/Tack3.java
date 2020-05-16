package Lessons.lesson3;

import java.util.Arrays;

public class Tack3 {
    public static void main(String[] args) {
         int[][] array = new int[5][];
         int count = 0;
            for(int i = 0; i < array.length; i++){
                array[i] = new int[i+1];
                ++count;
                Arrays.fill(array[i],count);

     }
        System.out.println(Arrays.deepToString(array));
    }
}
