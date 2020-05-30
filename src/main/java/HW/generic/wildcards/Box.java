package HW.generic.wildcards;

public class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    @Override
    public String toString() {
        return item.toString();
    }

    public void putOut() {
        this.item = null;
    }

}
