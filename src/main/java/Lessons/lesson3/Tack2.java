package Lessons.lesson3;

public class Tack2 {
    public static void main(String[] args) {
     int mas[] = {4, 7, 3, 8, 9, 2, 1};
     int max = mas[0];
      for (int i = 1; i < mas.length; i++){
         if (mas[i] > max){
            max = mas[i];
         }
     }
      System.out.println(max);
    }
}
