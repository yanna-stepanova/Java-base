package HW.hw5.shape.polygon.tetragon.parallelogram;

import HW.hw5.shape.polygon.tetragon.Tetragon;

public class Parallelogram extends Tetragon {
    private int aSide;
    private int bSide;

    {
        System.out.println("Parallelogram has two pairs of parallel sides");
    }

    public int perimeter(){
        return 2*(getaSide()+ getbSide());
    }

    public Parallelogram(int xPoint, int yPoint, int amountSides, int parallelPairs, int aSide, int bSide) {
        super(xPoint, yPoint, amountSides, parallelPairs);
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public Parallelogram(Parallelogram parallelogram) {
        super(parallelogram);
        this.aSide = parallelogram.getaSide();
        this.bSide = parallelogram.getbSide();
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }
}
