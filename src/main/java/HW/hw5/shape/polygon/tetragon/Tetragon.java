package HW.hw5.shape.polygon.tetragon;

import HomeWorks.hw5.shape.polygon.Polygon;

public class Tetragon extends Polygon {
    private int parallelPairs;

    {
        System.out.println("Tetragon can have parallel sides or not.");
    }

    public Tetragon(int xPoint, int yPoint, int amountSides, int parallelPairs) {
        super(xPoint, yPoint, amountSides);
        this.parallelPairs = parallelPairs;
    }

    public Tetragon(Tetragon tetragon) {
        super(tetragon);
        this.parallelPairs = tetragon.getParallelPairs();
    }

    public int getParallelPairs() {
        return parallelPairs;
    }

    public void setParallelPairs(int parallelPairs) {
        this.parallelPairs = parallelPairs;
    }
}
