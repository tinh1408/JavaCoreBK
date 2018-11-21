package com.ateach.quizz.reviewPf1;

import static org.junit.jupiter.api.Assertions.*;

class shiftalphabetTest {

    @org.junit.jupiter.api.Test
    void alphabeticShift() {
        shiftalphabet ob = new shiftalphabet();
        String st = "crazy";
        assertEquals("dsbaz",ob.alphabeticShift(st));
    }
}