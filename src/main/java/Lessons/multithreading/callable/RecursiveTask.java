package Lessons.multithreading.callable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RecursiveTask implements Callable<Integer> {

    private static ExecutorService executor = Executors.newCachedThreadPool();
    private int m;
    private int n;

    public RecursiveTask(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        else if (n == 0 && m > 0) { //
            return executor.submit(new RecursiveTask((m-1),1)).get();
        } // Шаг рекурсии / рекурсивное условие
        else {
            return (executor.submit( new RecursiveTask((m-1), executor.submit(new RecursiveTask(m, (n-1))).get()) )).get();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Integer> f1 = executor.submit(new RecursiveTask(3, 2));
        System.out.println("Result: "+ f1.get());
        executor.shutdown();
    }
}