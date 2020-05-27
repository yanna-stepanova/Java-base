package Lessons.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list){
        books.addAll(list);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "books=" + books.size() +
                '}';
    }

    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        albums.add(new Album());
        storage.addAll(albums);
        System.out.println(storage.toString());
    }
}
