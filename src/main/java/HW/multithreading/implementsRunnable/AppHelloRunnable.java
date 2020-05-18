package HW.multithreading.implementsRunnable;

/*
Запустить три новых потока класса HelloRunnable с разными именами.
 */

public class AppHelloRunnable {
    public static void main(String[] args) {
        Thread hello = new Thread(new HelloRunnable(), "First_Runnable");
        Thread hello2 = new Thread(new HelloRunnable(), "Second_Runnable");
        Thread hello3 = new Thread(new HelloRunnable(), "Third_Runnable");

        hello.start();
        hello2.start();
        hello3.start();
    }
}
