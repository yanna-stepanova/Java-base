package HW.generic.wildcards;
/*
Доступен класс Packer, но он разработан с нарушением бизнес-логики и не имеет реализации.
Исправьте код упаковщика, чтобы:
● Любой вид хлебобулочных изделий (Bakery) можно было упаковать в коробку с более базовым
  типом (например, из коробки с пирогом (Pie) в коробку с едой (Food).
● Базовые вещи, такие как еда (Food), нельзя упаковать в узкие коробки
  (например, с пирожными (Cake)).
● Произвольные классы, такие как String или Object, не могут быть перепакованы без ошибок
  или предупреждений во время компиляции.
● Переупаковка на самом деле происходит.
 */

import java.io.IOException;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        foodBox.put(new Food());
        Box<Food> foodBox2 = new Box<>();
        packer.repackage(foodBox2, foodBox);

        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake());
        packer.repackage(foodBox, cakeBox);
        Box<Cake> cakeBox2 = new Box<>();
        packer.repackage(cakeBox2, cakeBox);

        Box<Pie> pieBox = new Box<>();
        pieBox.put(new Pie());
        packer.repackage(foodBox, pieBox);

        Box<Tart> tartBox = new Box<>();
        tartBox.put(new Tart());
        packer.repackage(foodBox, tartBox);
//        packer.repackage(cakeBox2, pieBox);  //there will be error

        Box<String> stringBox = new Box<>();
        stringBox.put(new String("String"));
        Box<String> stringBox2 = new Box<>();
//        packer.repackage(stringBox2, stringBox); //there will be error
        Box<Object> objectBox = new Box<>();
        objectBox.put(new Object());
        Box<Object> objectBox2 = new Box<>();
//        packer.repackage(objectBox2,objectBox); //there will be error

    }

    public <T extends Goods> void repackage(Box<? super T> to, Box<? extends T> from) {
        to.putOut();
        to.put(from.get());
        System.out.println("BoxFrom{ " + from.toString() + "} -> BoxTo{" + to.toString() + "}");
    }
}














