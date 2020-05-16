package Lessons.lesson5.yana_stepanova;

import Lessons.lesson5.yana_stepanova.product.*;
import Lessons.lesson5.yana_stepanova.user.User;

public class Application {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Anna");
        user1.setLastName("Lomova");
        user1.setEmail("anna.lom@gmail.com");
        user1.setLog("ann205");
        user1.setPassword("55sa3945009dddd");
        user1.info();

        User user2 = new User();
        user2.setName("Olya");
        user2.setLastName("Karluka");
        user2.setEmail("ol.karl@gmail.com");
        user2.setLog("olga4566");
        user2.setPassword("495709ruewefj30iu3");

        User user3 = new User();
        user3.setName("Vova");
        user3.setLastName("Boich");
        user3.setEmail("vova.boich@gmail.com");
        user3.setLog("Vladimir5678");
        user3.setPassword("jofkoe0945829u");

    }
}
