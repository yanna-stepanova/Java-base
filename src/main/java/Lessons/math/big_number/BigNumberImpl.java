package Lessons.math.big_number;

import java.math.BigDecimal;

public class BigNumberImpl implements BigNumber {
    private volatile BigDecimal number;


    public BigNumberImpl(BigDecimal number) {
        this.number = number;
    }

    @Override
    public synchronized void increment(BigDecimal val) {
        number = number.add(val);
    }

    @Override
    public synchronized void divide(BigDecimal val) {
        number = number.divide(val);
    }

    @Override
    public synchronized void multiply(BigDecimal val) {
        number = number.multiply(val);
    }

    @Override
    public BigDecimal getValue() { //без sychronized т.к. volatile
        return number;
    }

    @Override
    public String toString() {
        return "BigNumberImpl{" +
                "number=" + number +
                '}';
    }
}
