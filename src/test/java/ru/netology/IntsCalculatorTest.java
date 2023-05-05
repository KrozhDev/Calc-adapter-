package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {


    Ints intsCalc = new IntsCalculator();


    @Test
    void sum() {
        int arg1 = 34;
        int arg2 = 5;
        int expect = 39;
        int test = intsCalc.sum(arg1,arg2);
        Assertions.assertEquals(expect,test);
    }

    @Test
    void mult() {
        int arg1 = 12;
        int arg2 = 5;
        int expect = 60;
        int test = intsCalc.mult(arg1,arg2);
        Assertions.assertEquals(expect,test);
    }

    @Test
    void pow() {
        int arg1 = 10;
        int arg2 = 5;
        int expect = 100000;
        int test = intsCalc.pow(arg1,arg2);
        Assertions.assertEquals(expect,test);
    }
}