package Lessons.lesson2;

public class App {
    public static void main(String[] args) {
      /* boolean weekend = false;
        boolean vacation = false;
        String action = "Nothen";
        if (!weekend && !vacation) // проверка не true
            action = "work";
        else
            action = "sleep";

         System.out.println(action);
       */
        boolean mA = false;
        boolean mB = false;
        String res = "res";
        if (mA ^ mB)//true
            res = "ok";
        else
            res = "not ok";
        System.out.println(res);
    }
}
