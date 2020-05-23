package HW.reader_file;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyFileReader {

    public void myGetReader(BufferedInputStream buffer) throws IOException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        StringBuffer stringBuffer = new StringBuffer(buffer.available());
        int k;
        while ((k = buffer.read()) != -1) {
            stringBuffer.append((char) k);
        }

        String[] arrayStr = stringBuffer.substring(0).split("\n");//делим на подстроки до '\n'
        for (int i = 0; i < arrayStr.length; i++) {
            String[] words = arrayStr[i].split(" "); // делим каждую подстроку на подстроки до пробела
            int count = 0;
            for (String word : words) {
                if (word.length() != 0 && !word.equals("\r")) {
                    count++;
                }
            }

            map.put((i + 1), count);
        }

        if (Character.isWhitespace(stringBuffer.charAt(stringBuffer.length() - 1))) {
            map.put(map.size() + 1, 0);
        }

        System.out.println("total rows amount: " + map.size());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.println("row #" + pair.getKey() + " has " + pair.getValue() + " words.");
        }
    }
}
