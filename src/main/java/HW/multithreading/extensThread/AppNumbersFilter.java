package HW.multithreading.extensThread;

/*
Реализовать метод run() таким образом, чтобы он читал из
консоли ввода числа и если число четное, то выводил его в
консоль, а если нечетное, то завершал работу программы.
 */

public class AppNumbersFilter {
    public static void main(String[] args) {
        Thread numbersFilter = new NumbersFilter();
        Thread numbersFilter2 = new NumbersFilter();
        numbersFilter.start();
        numbersFilter2.start();
    }
}
