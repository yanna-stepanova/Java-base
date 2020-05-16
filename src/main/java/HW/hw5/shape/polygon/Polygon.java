package HW.hw5.shape.polygon;

import HW.hw5.shape.Shape;

public class Polygon extends Shape {
    private int amountSides;

    {
        System.out.println("Polygon can have lots of sides");
    }

    public void infoType(){
        System.out.println("Polygon is convex");
    }

    public Polygon(int xPoint, int yPoint, int amountSides) {
        super(xPoint, yPoint);
        this.amountSides = amountSides;
    }

    public Polygon(Polygon polygon) {
        super(polygon);
        this.amountSides = polygon.getAmountSides();
    }

    public int getAmountSides() {
        return amountSides;
    }

    public void setAmountSides(int amountSides) {
        this.amountSides = amountSides;
    }



}
