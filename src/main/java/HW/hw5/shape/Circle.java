package HW.hw5.shape;

public class Circle extends Shape {
    private int radius;

    {
        System.out.println("Circle has center and radius.");
    }

    public double areaCircle(){
        return 3.14*getRadius();
    }

    public Circle(int xPoint, int yPoint, int radius) {
        super(xPoint, yPoint);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
