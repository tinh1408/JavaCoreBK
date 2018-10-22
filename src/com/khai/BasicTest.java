package com.khai;

import static org.junit.Assert.*;

public class BasicTest {

    @org.junit.Test
    public void basicAssignment() {
    }

    @org.junit.Test
    public void timMaxMin() {
        int min = 2;
        Basic bs = new Basic();
        int resul  = bs.timMaxMin();
        assertEquals(2,resul);
    }
}