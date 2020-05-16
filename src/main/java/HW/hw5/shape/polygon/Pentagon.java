package HW.hw5.shape.polygon;

public class Pentagon extends Polygon {
    private  int angle;

    {
        System.out.println("Pentagon can be equilateral with equal angles");
    }

    public Pentagon(Pentagon pentagon) {
        super(pentagon);
        this.angle = pentagon.getAngle();
    }

    public Pentagon(int xPoint, int yPoint, int amountSides, int angle) {
        super(xPoint, yPoint, amountSides);
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
