package com.ateach.test;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        TestDemo ts = new TestDemo();
       int tong =  ts.add(3,4);
       assertEquals(7,tong);
    }
}