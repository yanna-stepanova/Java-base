package HW.generic;

public class Truck extends Vehicle{
    private String id;

    public Truck() {
        this.id = "###";
    }

    public Truck(String number) {
        this.id = number;
    }

    @Override
    public String toString() {
        return "Truck{"+id+"}";
    }
}
