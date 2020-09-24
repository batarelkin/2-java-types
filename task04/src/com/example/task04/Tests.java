package com.example.task04;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Tests {

    private void check(int a, int b, String op, float output) {
        Assertions.assertThat(Task04.calculate(a, b, op)).as("Expression: %s %s %s", a, op, b).isEqualTo(output);
    }

    @Test
    public void testPlus() throws Exception {
        check(2, 2, new String("+"), 4f);
        check(-12, 2, new String("+"), -10f);
        check(-100, -99, new String("+"), -199f);
    }

    @Test
    public void testMinus() throws Exception {
        check(1234, 234, new String("-"), 1000f);
        check(-55, 5, new String("-"), -60f);
        check(624, -8, new String("-"), 632f);
    }

    @Test
    public void testDiv() throws Exception {
        check(-25, 5, new String("/"), -5f);
        check(5, 2, new String("/"), 2.5f);
        check(15, -3, new String("/"), -5f);
    }

    @Test
    public void testMul() throws Exception {
        check(-10, -10, new String("*"), 100f);
        check(10, 10, new String("*"), 100f);
        check(-10, 10, new String("*"), -100f);
        check(10, -10, new String("*"), -100f);
    }

}
