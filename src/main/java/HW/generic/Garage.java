package HW.generic;
/*
Cделать класс Garage “дженерик”, чтобы он мог
работать только с классом Vehicle и его подклассами.
Метод get возвращает объект по индексу.
Метод add добавляет новый объект.
Метод getByType() возвращает список объектов по указанному типу.
Пример вызова метода: garage.getByType(Car.class);
 */


import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private List<T> transport = new ArrayList<>();

    public T get(int i) {
        return transport.get(i);
    }

    public void add(T i) {
        transport.add(i);
    }

    public List<T> getByType(Class classType) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i<transport.size();i++) {
            if (classType.isInstance(transport.get(i))) {
                list.add(transport.get(i));
            }
        }
        return list;
    }

    @Override
    public String toString() {
        String string="Garage[ ";
        for (int i = 0; i< transport.size(); i++) {
            if(i!=(transport.size()-1)) {
                string = string.concat(transport.get(i)+", ");
            }
            else{
                string = string.concat(transport.get(i)+" ]");
            }
        }
        return string;
    }
}
