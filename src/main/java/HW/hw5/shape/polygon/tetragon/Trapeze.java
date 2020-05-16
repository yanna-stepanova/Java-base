package HW.hw5.shape.polygon.tetragon;

public class Trapeze extends Tetragon {
    private int a;
    private int b;
    private int height;

    {
        System.out.println("Trapeze has just one pair of parallel sides.");
    }

    public double areaTrap(){
        return ((getA()+getB())/2)*getHeight();
    }
    public Trapeze(int xPoint, int yPoint, int amountSides, int parallelPairs, int a, int b, int height) {
        super(xPoint, yPoint, amountSides, parallelPairs);
        this.a = a;
        this.b = b;
        this.height = height;
    }

    public Trapeze(Trapeze trapeze) {
        super(trapeze);
        this.height = trapeze.getHeight();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
