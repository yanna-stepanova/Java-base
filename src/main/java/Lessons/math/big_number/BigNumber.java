package Lessons.math.big_number;

import java.math.BigDecimal;

public interface BigNumber {
    /**
     * Увеличивает/Уменьшает текущее значение на указанную величину
     *
     * @param val - значение на которое нужно увеличить/уменьшить текущее значение
     */

    void increment(BigDecimal val);

    /**
     * Производит деление текущего значения и меняет его
     *
     * @param val - значение на которое нужно поделить текущее значение
     */
    void divide(BigDecimal val);

    /**
     * Вычисляет произведение и сохраняет произведение текущего значения на значение val
     *
     * @param val - значение на которое нужно умножить
     */
    void multiply(BigDecimal val);

    /**
     * @return - текущее значение
     */
    BigDecimal getValue();

    @Override
    String toString();
}