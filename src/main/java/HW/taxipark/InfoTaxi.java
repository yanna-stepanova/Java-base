package HW.taxipark;

public interface InfoTaxi {
    void allRatings();
    void sortCarsByFuel(Car[] carArray);
    double carPrice(Car car, double dist);
    double ratingPrice(Rating rating, double dist);
    void findCars(Rating rating, float maxFuel);


}
