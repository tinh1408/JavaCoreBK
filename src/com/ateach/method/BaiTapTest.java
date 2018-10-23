package com.ateach.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaiTapTest {

    @Test
    public void isPalindrome() {
        String str = "abvffvba44";
        BaiTap bt = new BaiTap();
        boolean test = bt.isPalindrome(str);
        assertEquals(test, true);


    }

    @Test
    public void giaPhong() {
    }
}