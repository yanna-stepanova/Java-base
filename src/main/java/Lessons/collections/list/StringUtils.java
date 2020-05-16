package Lessons.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringUtils {
    public List<String> getDuplicates(List<String> words) {
        List<String> listDupl = new ArrayList<String>();
        for (int j = 0; j < words.size(); j++) {
            int count = 0;
            for (int i = j; i < words.size(); i++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
                if (count > 1) {
                    if (!listDupl.contains(words.get(j))) {
                        listDupl.add(words.get(j));
                    }
                }
            }
        }
        return listDupl;
    }

    public String getLongestWord(List<String> words) {
        String longWord = new String();
        int sizeWord = 0;
        for (String value : words) {
            if (value.length() > sizeWord) {
                sizeWord = value.length();
                longWord = value;
            }
        }
        return longWord;
    }

    public Set<String> getHashDuplicates(List<String> words) {
        Set<String> hashDupl = new HashSet<String>();
        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            for (int j = i; j < words.size(); j++) {
                if (words.get(j).equals(words.get(i))) {
                    count++;
                }
                if (count > 1) {
                    hashDupl.add(words.get(i));
                }
            }
        }
        return hashDupl;
    }
}
