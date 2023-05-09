package Zadanie1;

import java.math.BigDecimal;
import java.util.List;


public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> numbers) {

        BigDecimal sum= BigDecimal.ZERO;
        for (int i= 0; i < numbers.size(); i++) {
            BigDecimal a= numbers.get(i);
            sum= sum.add(a);
        }
        return sum;
    }
}
