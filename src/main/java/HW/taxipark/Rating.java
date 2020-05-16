package HW.taxipark;

import java.util.Arrays;

public class Rating {
    private String rating;
    private double tariff;
    Car[] cars;

    {
        cars = new Car[10];
    }

    public Rating(Rating object) {
        this.rating = object.getRating();
    }

    public Rating(String rating) {
        this.rating = rating;
    }

    public Rating(String rating, double tariff) {
        this.rating = rating;
        this.tariff = tariff;
    }

    public Rating(String rating, Car car) {
        this.rating = rating;
        this.setCar(car);
    }

    public Rating(String rating, double tariff, Car car) {
        this.rating = rating;
        this.tariff = tariff;
        this.setCar(car);
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCar(Car car) {
        boolean isCarAdded = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                isCarAdded = true;
                return;
            }
        }
        if (!isCarAdded) {
            cars = Arrays.copyOf(cars, cars.length + (cars.length >> 1));
        }
    }

    public void deleteCar(Car car) {
        if (cars == null) {
            return;
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                cars[i] = null;
                return;
            }
        }
    }


}
