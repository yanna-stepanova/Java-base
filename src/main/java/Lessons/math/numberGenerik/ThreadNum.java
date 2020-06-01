package Lessons.math.numberGenerik;

public class ThreadNum extends Thread {
    private NumberGenerik numberGenerik = new NumberGenerik();
    private int result =0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            result += numberGenerik.getRanNum();
        }
        System.out.println(getName() + " " + result);
    }

    public int getResult() {
        return result;
    }
}
