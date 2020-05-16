package Lessons.collections.map;
/*
Создать метод, который принимает список слов, и возвращает мапу, где
ключ это длина слова, а значение список слов:
- public TreeMap<Integer, List<String>> getLengthWithWords(List<String> words).
 */

import java.util.Arrays;
import java.util.List;

public class AppTreeMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one","where","or","I","apple","tree","hwo","me","a","long");
        MyTreeMap treeMap = new MyTreeMap();
        System.out.println(treeMap.getLengthWithWords(words));
    }
}
