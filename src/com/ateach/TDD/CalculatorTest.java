package com.ateach.TDD;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
//    @Test
//    void testAdd() {
//        int x = 1;
//        int y = 1;
//        Calculator instance = new Calculator();
//        int expResult = 2;
//        int result = instance.add(x, y);
//        assertEquals(expResult, result);
//    }

    @Test
    void testSub() {
        int x = 3;
        int y = 2;
        Calculator instancs = new Calculator();
        int resub = instancs.sub(x, y);
        int expResult = 1;
        assertEquals(expResult, resub);
    }
}