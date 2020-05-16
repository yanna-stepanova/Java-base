package Lessons.collections.comparator;

import java.util.Comparator;

public class CarCompareVolume implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.getYearOfManufacture() - o2.getYearOfManufacture();
        if (o1.getVolume() == o2.getVolume()) {
            if (o1.getVolume() == 0) {
                result = 1;
            }
        }
        if (o1.getVolume() > o2.getVolume()) {
            if (o2.getVolume() == 0) {
                result = -1;
            } else {
                result = 1;
            }
        }
        if (o1.getVolume() < o2.getVolume()) {
            if (o1.getVolume() == 0) {
                result = 1;
            } else {
                result = -1;
            }
        }
        return result;
    }
}



