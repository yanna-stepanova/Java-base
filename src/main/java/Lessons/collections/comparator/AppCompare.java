package Lessons.collections.comparator;
/*
● Создать список автомобилей - List<Car> cars и отсортировать его
по году производства - yearOfManufacture().

● Создать новый TreeSet<Car> cars, в котором автомобили будут
отсортированы по объему двигателя по возрастанию. Но если
объем двигателя равен 0, то он должен быть в конце списка.
 */

import java.util.*;

public class AppCompare {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>() {{
            add(new Car("Citroen", "Picasso", 2018));
            add(new Car("Citroen", "C5", 2007));
        }};
        Car car1 = new Car("Volvo", "S60", 2016);
        car1.setVolume(2.5);
        Car car2 = new Car("Kia", "Optima", 2017);
        car2.setVolume(1.6);
        Car car3 = new Car("Daewoo", "Lanos", 2014);
        car3.setVolume(1.6);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        Comparator<Car> comparator = new CarComparator();
        Collections.sort(carList, comparator);
        System.out.println("List:" + carList);

        Comparator<Car> comparator2 = new CarCompareVolume();
        Set<Car> carsSet = new TreeSet<>(comparator2);
        carsSet.addAll(carList);
        System.out.println("TreeSet:" + carsSet);
    }
}
