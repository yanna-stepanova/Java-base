package HW.generic;

import java.util.List;

public class AppGeneric {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<>();
        garage.add(new Vehicle());
        garage.add(new Car());
        garage.add(new Truck());
        garage.add(new Car(1));
        garage.add(new Car(2));
        garage.add(new Truck("A01"));
     //   garage.add(new Cat()); //will be mistake
        System.out.println(garage.toString());

        List<Vehicle> list = garage.getByType(Car.class);
        System.out.println("List of Car class:");
        for(int j=0; j<list.size(); j++){
            System.out.println("--"+list.get(j));
        }
    }
}
