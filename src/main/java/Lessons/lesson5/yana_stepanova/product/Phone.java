package Lessons.lesson5.yana_stepanova.product;

public class Phone extends Product {
    private float weight;

    public Phone(long id) {
        super(id);
    }

    public Phone(String brand, long id) {
        super(brand, id);

    }

    public Phone(String brand, String category, long id) {
       super(brand,category,id);
    }

    public String getInfo(){
        return getBrand()+" "+getId();
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
