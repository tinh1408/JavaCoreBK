package com.ateach.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContructArrayTest {

    @Test
    void constructArray() {
        ContructArray ct = new ContructArray();
        System.out.println(Arrays.toString(ct.constructArray(7)));


    }
}