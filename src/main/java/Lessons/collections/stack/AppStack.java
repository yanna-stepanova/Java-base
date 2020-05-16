package Lessons.collections.stack;
/*
Написать класс LinkedListStack, который имеет три метода и работает как стек.
Внутри класса нужно использовать LinkedList.
 */

public class AppStack {
    public static void main(String[] args) {
        LinkedListStack listStack = new LinkedListStack();
        System.out.println("Is stack empty? -> " + listStack.isEmpty());
        listStack.push("8 march");
        listStack.push("20 april");
        listStack.push("3 november");
        listStack.push("31 december");
        System.out.println(listStack.toString());
        listStack.pop();
        System.out.println("Is stack empty? -> " + listStack.isEmpty());
        System.out.println("After delete: ");
        System.out.println(listStack.toString());
        listStack.pop();
        listStack.pop();
        listStack.pop();
        System.out.println("Is stack empty? -> " + listStack.isEmpty());


    }
}
