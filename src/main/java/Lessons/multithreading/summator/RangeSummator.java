package Lessons.multithreading.summator;

public class RangeSummator extends Thread {
    private int from;
    private int to;
    private long result;
    public RangeSummator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for(int i=from; i<=to;i++){
            result += i;
        }
    }

    public long getResult() {
        //Возвращает сумму
        return result;
    }
}

