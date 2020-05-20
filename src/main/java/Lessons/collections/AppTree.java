package Lessons.collections;
/*
Создать список имен вывести его в алфавитном порядке.
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AppTree {
    public static void main(String[] args) {
        Set<String> stringSet= new TreeSet<String>();
        stringSet.add("Olga");
        stringSet.add("Elena");
        stringSet.add("Anna");
        stringSet.add("Vika");
        stringSet.add("Marina");
        stringSet.add("Iren");
        stringSet.add("Arina");
        stringSet.add("Olga");  //won't be added(tree saves just unique elements)
        stringSet.add("Erika");
        stringSet.add("Inga");
        stringSet.add("Milana");
        stringSet.add("Oksana");
        stringSet.add("Vlada");
        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
