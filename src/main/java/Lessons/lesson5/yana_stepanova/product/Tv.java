package Lessons.lesson5.yana_stepanova.product;

public class Tv extends Product {
    private int diagonal;

    public String getInfo(){
        return getBrand()+" - "+getId();
    }

    public Tv(long id) {
        super(id);
    }

    public Tv(String brand, long id) {
        super(brand, id);
    }

    public Tv(String brand, String category, long id) {
        super(brand,category,id);
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

}


