package Lessons.generic;

public class AppGenericMetod {
    public static void main(String[] args) {
        Integer[] ints = {1,5};
        printsArray(ints);
        String[] strings = {"f", "u", "n"};
        printsArray(strings);
    }

    private static<T> void printsArray(T[] ints) {
        System.out.print("[ ");
        for (T item: ints){
            System.out.print(item+" ");
        }
        System.out.print("]\n");
    }
}
