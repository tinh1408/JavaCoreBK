package com.ateach.pdf2.cake;

public class MoonCake implements Transport, Price{

    @Override public double calcPrice() {
        return 0;
    }


    @Override public int getDiscount() {
        return 0;
    }
}
