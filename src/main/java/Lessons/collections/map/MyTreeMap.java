package Lessons.collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyTreeMap {
    public TreeMap<Integer, List<String>> getLengthWithWords(List<String> words) {
        TreeMap<Integer, List<String>> map = new TreeMap<Integer, List<String>>();
        int longStr = 0;
        List<String> items = new ArrayList<String>();
        for (int i = 0; i < words.size(); i++) {
            items.clear();
            longStr = words.get(i).length();
            if (map.isEmpty()) {
                items.add(words.get(i));
                map.put(longStr, new ArrayList<String>(items));
            } else {
                if (map.containsKey(longStr)) {
                    items.addAll(map.get(longStr));
                    if (!items.contains(words.get(i))) {
                        items.add(words.get(i));
                        map.put(longStr, new ArrayList<String>(items));
                    }
                } else {
                    items.add(words.get(i));
                    map.put(longStr, new ArrayList<String>(items));
                }
            }
        }
        return map;
    }
}
