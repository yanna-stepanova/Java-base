package HW.hw5.shape.polygon;

public class Trigon extends Polygon {
    private int a, b, c;

    {
        System.out.println("Trigon has three sides.");
    }

    public int perimeterTrigon(){
        return getA()+getB()+getC();
    }

    public Trigon(int xPoint, int yPoint, int amountSides, int a, int b, int c) {
        super(xPoint, yPoint, amountSides);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Trigon(Trigon trigon) {
        super(trigon);
        this.a = trigon.getA();
        this.b = trigon.getB();
        this.c = trigon.getC();
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
