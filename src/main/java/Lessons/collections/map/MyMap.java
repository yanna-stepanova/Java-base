package Lessons.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public void replaceKeyValue(Map<String, String> map){
        Map<String, String> mapTemp = new HashMap<String, String>();
        for (Map.Entry<String,String> pair: map.entrySet()){
            mapTemp.put(pair.getValue(), pair.getKey());
        }
        map.clear();
        map.putAll(mapTemp);
    }
}
