package Lessons.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
Есть Мапа - {“one”:”один”, “two”: “два” ,”three”:”три”, “four”:”четыре”, “five”:”пять”}
Нужно создать метод который меняет местами ключ<->значение у этой же мапы.
- public void replaceKeyValue(Map<String, String> map).
 */
public class AppMap {
    public static void main(String[] args) {
        Map<String, String> mapStr = new HashMap<String, String>(){{
            put("one", "один");
            put("two", "два");
            put("three", "три");
            put("four", "четыре");
            put("five", "пять");
        }};
        MyMap myMap = new MyMap();
        myMap.replaceKeyValue(mapStr);
        System.out.println(mapStr);

    }
}
