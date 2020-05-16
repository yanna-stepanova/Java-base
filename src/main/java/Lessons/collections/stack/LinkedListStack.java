package Lessons.collections.stack;

import java.util.LinkedList;

public class LinkedListStack {
    private final LinkedList<String> linkedList = new LinkedList<String>();

    public void push(String data) {
        linkedList.addLast(data);
    }

    public String pop() {
        return linkedList.removeLast();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
