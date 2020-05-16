package Lessons.lesson5.yana_stepanova;

import Lessons.lesson5.yana_stepanova.product.*;

public class App {
    public static void main(String[] args) {
        Product[] objects = {new Phone("Nokia", "Smart", 5),
                new Tv("Sony", 154),
                new Phone("IPhone", 567), new Tv("Phillips", 345)};
        info(objects);

    }

    static void info(Product[] products) {
        for (Product ob : products) {
            System.out.println(ob.getInfo());
        }
    }

}
