package HW.generic;

public class Car extends Vehicle{
    private int number;

    public Car(int number) {
        this.number = number;
    }

    public Car() {
        this.number = 0;
    }

    @Override
    public String toString() {
        return "Car{"+number+"}";
    }
}
