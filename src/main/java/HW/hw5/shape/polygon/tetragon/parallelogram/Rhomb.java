package HW.hw5.shape.polygon.tetragon.parallelogram;

public class Rhomb extends Parallelogram {
    private double diagonal1;
    private double diagonal2;

    {
        System.out.println("Rhomb has different diagonals and equal sides.");
    }

    public double areaRhomb(){
        return (getDiagonal1()*getDiagonal2())/2;
    }

    public Rhomb(int xPoint, int yPoint, int amountSides, int parallelPairs, int aSide, int bSide, double diagonal1, double diagonal2) {
        super(xPoint, yPoint, amountSides, parallelPairs, aSide, bSide);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhomb(Rhomb rhomb) {
        super(rhomb);
        this.diagonal1 = rhomb.getDiagonal1();
        this.diagonal2 = rhomb.getDiagonal2();
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
