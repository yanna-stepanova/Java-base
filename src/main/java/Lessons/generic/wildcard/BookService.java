package Lessons.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> bookSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        albumSource.add(new Album());

        copyToBooks(albumSource, booksDestination);
        System.out.println("Copy 'List<Album>' to 'List<Book>':");
        for (Book objB : booksDestination) {
            System.out.println(objB);
        }

        System.out.println("Copy 'List<Album>' to 'List<Album>':");
        copyToBooks(albumSource, albumDestination);
        for (Book objA : albumDestination) {
            System.out.println(objA);
        }

        System.out.println("Copy 'List<Book>' to 'List<Book>':");
        copyToBooks(bookSource, booksDestination);
        for (Book objBook : booksDestination) {
            System.out.println(objBook);
        }
    }

    private static <T extends Book> void copyToBooks(List<T> src, List<? super T> dest) {
        for (T book : src) {
            dest.add(book);
        }
    }
}
