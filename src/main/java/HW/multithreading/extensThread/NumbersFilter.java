package HW.multithreading.extensThread;

import java.util.Scanner;

public class NumbersFilter extends Thread {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while(scanner.hasNext()){
            int number = scanner.nextInt();
            if (number%2==0){
                System.out.println(getName()+ ": "+number);
            }
            else{
                System.out.println("Finish "+getName()+"!");
                break;
            }
        }
    }
}
