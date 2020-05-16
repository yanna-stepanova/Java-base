package Lessons.collections.list;

import java.util.List;

public class NumberUtils {
    public Integer getSum(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer value : numbers) {
            sum += value;
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.set(i, (numbers.get(i) * 2));
            }
        }
        return numbers;
    }
}
