package Lessons.collections.map;

import java.util.HashMap;
import java.util.List;

public class MyHashMap {
    public HashMap<String, Integer> getWordsWithLength(List<String> words) {
        HashMap<String, Integer> myMap = new HashMap<>();
        for (String str : words) {
            myMap.put(str, str.length());
        }
        return myMap;
    }

    public HashMap<String, Integer> getCountedWords(List<String> words) {
        HashMap<String, Integer> mapDupl = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            for (int j = i; j < words.size(); j++) {
                if (words.get(j).equals(words.get(i))) {
                    count++;
                }
            }
            if(!mapDupl.containsKey(words.get(i))){
                mapDupl.put(words.get(i), count);
            }
        }

        return mapDupl;
    }
}
