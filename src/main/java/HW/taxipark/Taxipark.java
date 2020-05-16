package HW.taxipark;

import java.util.Arrays;

public class Taxipark implements InfoTaxi {
    private Car[] cars;
    private Rating[] autoClass;
    private double distance;

    {
        cars = new Car[10];
        autoClass = new Rating[10];
    }


    public Taxipark(Car object) {
        setCar(object);
        setAutoClass(object.getAutoRating());
    }

    public Taxipark(Rating object) {
        setAutoClass(object);
    }

    public Taxipark(Car car, double distance) {
        setCar(car);
        this.distance = distance;
    }


    public Car[] getCars() {
        return cars;
    }

    public Car getCar(Car object) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == object)
                return cars[i];
        }
        return null;
    }

    public void setCar(Car newCar) {
        boolean isCarAdded = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = newCar;
                isCarAdded = true;
                break;
            }
        }
        if (!isCarAdded) {
            cars = Arrays.copyOf(cars, cars.length + (cars.length >> 1));
        }
        if (newCar.getAutoRating() != null) {
            setAutoClass(newCar.getAutoRating());
        }
    }

    public void deleteCar(Car ob) {
        if (cars == null) {
            return;
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(ob)) {
                cars[i] = null;
                return;
            }
        }
    }

    public Rating[] getAutoClass() {
        return autoClass;
    }

    public Rating getAutoRating(String nameRating) {
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] != null) {
                if (autoClass[i].getRating().equals(nameRating)) {
                    return autoClass[i];
                }
            }
        }
        return null;
    }

    public void setAutoClass(Rating ob) {
        boolean isRatingAdd = false;
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] != null) {
                if (autoClass[i] == ob) {
                    return;
                }
            } else if (autoClass[i] == null) {
                autoClass[i] = ob;
                isRatingAdd = true;
                break;
            }
        }
        if (!isRatingAdd) {
            autoClass = Arrays.copyOf(autoClass, autoClass.length + (autoClass.length >> 1));
        }
    }

    public void deleteRating(Rating ob) {
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] != null) {
                if (autoClass[i].equals(ob)) {
                    autoClass[i] = null;
                    return;
                }
            }
        }
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void allRatings() {
        if (autoClass == null) {
            return;
        }
        System.out.println("List of ratings:");
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] != null) {
                System.out.println("- " + autoClass[i].getRating() + " (tariff = " + autoClass[i].getTariff() + "): ");
                if (autoClass[i].getCars() != null) {
                    int num = 0;
                    for (Car value : autoClass[i].getCars()) {
                        if (value != null) {
                            System.out.println("  " + (++num) + ")" + value.getModel() + " (" + value.getBrand() + ") has fuel consumption "
                                    + value.getFuelСonsumption());
                        }
                    }
                }
            }
        }
    }

    public void quickSort(Car[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Car pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker].getFuelСonsumption() < pivot.getFuelСonsumption()) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker].getFuelСonsumption() > pivot.getFuelСonsumption()) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Car tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public void infoCar(Car carInfo) {
        System.out.println(carInfo.getBrand() + "-" + carInfo.getModel() + " "
                + carInfo.getAutoRating().getRating() + " with fuel consumption = " + carInfo.getFuelСonsumption());
    }

    public void carsPrint(Car[] objectArray) {
        System.out.println("List of cars:");
        int i = 0;
        for (Car objectCar : objectArray) {
            if (objectCar != null) {
                System.out.print((++i) + ") ");
                infoCar(objectCar);
            }
        }
    }

    @Override
    public void sortCarsByFuel(Car[] carArray) {
        if (carArray == null) {
            return;
        }
        quickSort(carArray, 0, (carArray.length - 1));
        carsPrint(carArray);
    }

    @Override
    public double carPrice(Car car, double dist) {
        double price = 1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == car)
                price = car.getAutoRating().getTariff() * distance;
        }
        return price;
    }

    @Override
    public double ratingPrice(Rating rating, double dist) {
        double price = 1;
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] == rating) {
                price = rating.getTariff() * distance;
            }
        }
        return price;
    }

    @Override
    public void findCars(Rating rating, float maxFuel) {
        if (autoClass == null) {
            return;
        }
        for (int i = 0; i < autoClass.length; i++) {
            if (autoClass[i] == rating) {
                sortCars(autoClass[i].getCars(), maxFuel);
            }
        }
    }

    public void sortCars(Car[] carsRating, float max) {
        int count = 0;
        for (Car ob : carsRating) {
            if (ob != null) {
                count++;
            }
        }
        Car[] newArray = new Car[count];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == null) {
                newArray[i] = carsRating[i];
            }

        }
        quickSort(newArray, 0, (newArray.length - 1));
        for (Car value : newArray) {
            if (value.getFuelСonsumption() < max) {
                System.out.print("\t");
                infoCar(value);
            }
        }
    }

}
