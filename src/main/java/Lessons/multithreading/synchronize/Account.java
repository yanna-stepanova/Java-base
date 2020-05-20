package Lessons.multithreading.synchronize;

public class Account {
    private volatile long balance = 0;

    public synchronized boolean withdraw(long amount) {
        if (balance != 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}
