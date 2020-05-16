package HW.hw5.shape;

public class Shape {
    private int xPoint;
    private int yPoint;

    {
        System.out.println("Shape consists of points.");
    }
    public Shape(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public Shape(Shape shape) {
        this(shape.getxPoint(), shape.getyPoint());
    }

    public int getxPoint() {
        return xPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }
}
