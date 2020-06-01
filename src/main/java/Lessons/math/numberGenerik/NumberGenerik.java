package Lessons.math.numberGenerik;

import java.util.Random;

public class NumberGenerik {
    public int getRanNum() {
        return new Random().nextInt(7)+1;
    }
}
