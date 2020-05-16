package HW.hw5.shape.polygon.tetragon.parallelogram;

public class Square extends Parallelogram {
    private int area;

    {
        System.out.println("Square has equal sides and equal diagonals");
    }

    public double findSide(){
        return Math.sqrt((double)getArea());
    }
    public Square(int xPoint, int yPoint, int amountSides, int parallelPairs, int aSide, int bSide, int area) {
        super(xPoint, yPoint, amountSides, parallelPairs, aSide, bSide);
        this.area = area;
    }

    public Square(Square square) {
        super(square);
        this.area = square.getArea();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
