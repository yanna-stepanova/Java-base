package Lessons.collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyTreeMap {
    public TreeMap<Integer, List<String>> getLengthWithWords(List<String> words) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        int longStr=0;
        List<String> items = new ArrayList<>();
              for (int i = 0; i<words.size();i++) {
                  items.clear();
                  longStr = words.get(i).length();
                  for (String str : words){
                      if (str.length()==longStr){
                          items.add(str);
                      }
                  }
                  map.put(longStr, new ArrayList<String>(items));
        }
        return map;
    }
}
