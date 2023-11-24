package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTests {

    SumCalculator sumCalculator;

    @BeforeEach
    public void toCreateInstance() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumWhenSourceNumberIs1Test()  {

        int expect = 1;
        int actual = sumCalculator.sum(1);

        Assertions.assertEquals(expect, actual);
    }
    @Test
    void sumWhenSourceNumberIs3Test()  {

        int expect = 6;
        int actual = sumCalculator.sum(3);

        Assertions.assertEquals(expect, actual);
    }
    @Test
    void sumWhenSourceNumberIs0Test()  {

        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
