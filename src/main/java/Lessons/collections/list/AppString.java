package Lessons.collections.list;
/*
Создать список строк с именем strings, заполнить его элементами.
Создать Класс StringUtils, у которого есть след.методы:
- getDuplicates(List<String> words) - принимает список строк и возвращают дубликаты;
- getLongestWord(List<String> words) - находит самое длинное слово.
Переделать метод, который возвращает дубликаты с использованием HashSet.
 */
import java.util.ArrayList;
import java.util.List;

public class AppString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("one");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        strings.add("seven");
        strings.add("three");
        strings.add("three");
        strings.add("eleven");
        strings.add("one");
        strings.add("four");
        StringUtils stringUtils = new StringUtils();
        System.out.println("There're some duplicates: " + stringUtils.getDuplicates(strings));
        System.out.println("The longest word is '" + stringUtils.getLongestWord(strings) + "'");
        System.out.println("HashSet duplicates - " + stringUtils.getHashDuplicates(strings));
    }

}
