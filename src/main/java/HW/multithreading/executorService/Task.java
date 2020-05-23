package HW.multithreading.executorService;

public class Task implements Runnable {
    private int number;

    public Task(int nextInt) {
        this.number = nextInt;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println("Number " + number + " is prime (Thread - '" + Thread.currentThread().getName() + "\').");
        } else {
            System.out.println("Number " + number + " isn't prime!! (Thread - '" + Thread.currentThread().getName() + "\').");
        }
    }

    private boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}
