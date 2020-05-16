package Lessons.lesson3;

public class Tack1 {
    public static void main(String[] args) {
     int mas[] = {4, 7, 3, 8, 9, 2, 1};
     int oddMas[] = new int[mas.length];
     int count = 0;
     for (int i = 0; i < mas.length; i++){
         if (mas[i] % 2 != 0){
             oddMas[count] = mas[i];
             count++;
             System.out.println(oddMas[i]);
         }
     }
    for(int i = 0; i < oddMas.length; i++) {
         if (oddMas[i] != 0){
             System.out.println(oddMas[i]);
         }

     }


    }
}
