package HW.hw5;

import HomeWorks.hw5.shape.polygon.tetragon.parallelogram.Square;

public class Application {
    public static void main(String[] args) {
        Square kvadrat = new Square(0,0,4,2,2,2,4);
        System.out.println("Find side from area: "+ kvadrat.findSide());
    }
}
