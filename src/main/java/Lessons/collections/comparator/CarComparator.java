package Lessons.collections.comparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.getYearOfManufacture() - o2.getYearOfManufacture();
        if (result == 0){
            result = Double.compare(o1.getVolume(), o2.getVolume());
        }
        return result;
    }
}
