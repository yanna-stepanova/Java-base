package HW.consoleTOjson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Программа считывает с консоли пары имя/значение. Если в консоль ввести end,
программа завершит работу и создаст JSON файл.
Пример ввода:
name = Tony
age = 5
end
Файл JSON:
{“name” : “Tony”, “age” : 5}
 */
public class ConsoleReader {
    public static void main(String[] args) {
        File output = new File("src/main/resources/consoleTojson.json");
        try (Scanner scanner = new Scanner(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output), 10)) {
            Map<String, String> map = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if ("end".equals(line)) {
                    break;
                }
                String[] items = line.split("=");
                map.put(items[0], items[1]);
            }
            writer.write("{");
            int count = 0;
            for (Map.Entry<String, String> pair : map.entrySet()) {

                writer.write("\"" + pair.getKey() + "\" : \"" + pair.getValue() + "\"");
                if (count < map.size()-1) {
                    writer.write(", ");
                }
                count++;
            }
            writer.write("}");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


