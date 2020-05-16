package HW.hw6;

public class Division extends Operation {
    @Override
    public double act(int a, int b) {
        if (a!=0 && b!=0) {
            return (double)a/b;
        }
        else
            return 0;
    }
}
