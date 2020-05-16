package Lessons.lesson2;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i%2 != 0) {
                continue;
            }
            System.out.println("Count is " + i);
        }
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("Count is  "+ i);
        }
        int j = 0;
        for (; ; j++) {
            if (j>10){

                break;
            }
            System.out.println("Count is"+ j);
        }
        int j2 = 0;
        for (; ; ) {
            j2++;
            if (j2>10){

                break;
            }

            System.out.println("Count is"+ j2);
        }

    }
}
