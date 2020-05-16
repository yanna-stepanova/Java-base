package Lessons.collections.map;
/*
Создать метод который принимает на вход список слов:{one, b, three, four, seven, eight,
nine, twelve, eleven, one, a, tewntyOne, seventyFour, one, null} - и возвращает
Мапу, где ключ это слово, а значение - длина слова:
- public HashMap<String, Integer> getWordsWithLength(List<String> words).

Создать метод, который возвращает мапу, где ключ это слово, а значение
количество повторений:
- public HashMap<String, Integer> getCountedWords(List<String> words).

 */
import java.util.Arrays;
import java.util.List;

public class AppHashMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "b", "three", "four", "seven", "eight", "nine", "twelve",
                "eleven", "one", "a", "tewntyOne", "seventyFour", "one", "null");
        MyHashMap object = new MyHashMap();
        System.out.println("Cлово - длина слова:"+object.getWordsWithLength(words));
        System.out.println("Cлово - число повторений:"+ object.getCountedWords(words));

    }
}