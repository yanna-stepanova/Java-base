package Lessons.lesson6;

public class Main {
    static void print (A a){
        System.out.println("A");
    }

    static void print (B b){
        System.out.println("B");
    }
    static void print2 (A a){
        a.info();
    }

    static void print2 (B b){
        b.info();
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        print(a);
        print(b);
        print(ab);
        print2(a);
        print2(b);
        print2(ab);
    }
}
