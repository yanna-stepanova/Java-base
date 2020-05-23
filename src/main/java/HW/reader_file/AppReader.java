package HW.reader_file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
Написать программу, которая считывает файл и выводит количество строк
в файле и количество слов в каждой строке. Слова разделены пробелом, а
строки специальным символом \n .
Пример вывода:
total rows amount: 4
row # 1 has 2 words
row # 2 has 2 words
row # 3 has 1 words
row # 4 has 0 words
 */
public class AppReader {
    public static void main(String[] args) {
        String fileName = "src/main/resources/input.txt";

        try(FileInputStream inputStream = new FileInputStream(fileName)){
            MyFileReader myFileReader = new MyFileReader();
            BufferedInputStream bufferInputStream = new BufferedInputStream(inputStream,200);  //считывает данные не по одному байту,
                                                                                                    // а блоками и временно хранит их в специальном буфере
                                                                                                    //уменьшаем количество обращений к файлу.
            myFileReader.myGetReader(bufferInputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
