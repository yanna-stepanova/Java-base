package Lessons.gson;

import com.google.gson.Gson;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
Создать программу, которая сериализует / десериализует объекты класса
Order.java, где поле products не сериализуем

 */
public class AppSerializ {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Product product1 = new Product(20001, "Potato", "13.6", "Vegetable");
        Product product2 = new Product(20002, "Orange", "30", "Fruit");
        Map<Product, Integer> mapProduct = new HashMap<>();
        mapProduct.put(product1, 20);
        mapProduct.put(product2, 5);
        Order order = new Order(10001, mapProduct, new Date());
        String string = gson.toJson(order); //сериализует
        System.out.println(string);
        Order order2 = gson.fromJson(string, Order.class); //десериализует
        System.out.println(order2);
    }
}
