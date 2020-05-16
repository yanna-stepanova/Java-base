package HW.taxipark;

public class Car extends Vehicle {
    private String model;
    private float fuelСonsumption;
    private Rating autoRating;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public Car(String brand, String model, float fuelСonsumption) {
        super(brand);
        this.model = model;
        this.fuelСonsumption = fuelСonsumption;
    }

    public Car(String brand, String model, Rating rating) {
        super(brand);
        this.model = model;
        this.autoRating = rating;
        rating.setCar(this);
    }

    public Car(String brand, String model, Rating rating, float fuelCons) {
        super(brand);
        this.model = model;
        this.autoRating = rating;
        rating.setCar(this);
        this.fuelСonsumption = fuelCons;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Rating getAutoRating() {
        return autoRating;
    }

    public void setAutoRating(String rating) {
        autoRating = new Rating(rating);
        autoRating.setRating(rating);
        autoRating.setCar(this);
    }

    public void setAutoRating(String rating, double tariffCar) {
        autoRating = new Rating(rating, tariffCar);
        autoRating.setRating(rating);
        autoRating.setTariff(tariffCar);
        autoRating.setCar(this);
    }

    public float getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(float fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

}
