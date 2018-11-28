package com.ateach.pdf2.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomOopTest {

    @Test
    void getRandomValue() {
        RandomOop ob = new RandomOop(1);
        ob.getRandomValue();
    }
}