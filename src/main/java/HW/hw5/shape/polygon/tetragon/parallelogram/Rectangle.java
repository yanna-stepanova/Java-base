package HW.hw5.shape.polygon.tetragon.parallelogram;

public class Rectangle extends Parallelogram {
    private int diagonal;

    {
        System.out.println("Rectangle has equal diagonals");
    }

    public boolean chekDiagonal(){
        int hypotenuse= 0;
        boolean correct=false;
        hypotenuse = getaSide()*getaSide() + getbSide()*getbSide();
        if (hypotenuse == (getDiagonal()*getbSide())){
            correct=true;
        }
        return correct;
    }
    public Rectangle(int xPoint, int yPoint, int amountSides, int parallelPairs, int aSide, int bSide, int diagonal) {
        super(xPoint, yPoint, amountSides, parallelPairs, aSide, bSide);
        this.diagonal = diagonal;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.diagonal = rectangle.getDiagonal();
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
