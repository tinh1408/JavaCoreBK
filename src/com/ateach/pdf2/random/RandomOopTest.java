package com.ateach.pdf2.random;

import org.junit.jupiter.api.Test;

class RandomOopTest {

    @Test
    void getRandomValue() {
        RandomOop ob = new RandomOop(1000);
        ob.getRandomValue();
    }
}