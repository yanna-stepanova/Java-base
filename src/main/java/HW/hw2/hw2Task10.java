/*
Вывести в консоль все простые числа от 2 до 1_000_000.
Просто́е число́ — это натуральное число, больше единицы, имеющее ровно два
натуральных делителя: 1 и само себя.
*/
package HW.hw2;
public class hw2Task10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000000; i++) {
            if (isPrimeNumber(i) == 1){
              System.out.print(i + " ");
            }

        }

    }
     static int isPrimeNumber (int n){
        int count=0;
        for (int i = 2; i <= n; i++){
            if(n%i != 0){
                continue;
            }
            count++;
        }
        return count;
     }
}

