package com.ateach.pdf2.stock;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @org.junit.jupiter.api.Test
    void getChangePercent() {
        Stock obj = new Stock("ORCL ","Oracle Corporation");
        obj.getChangePercent(34.5,34.35);
        obj.displayInfoChange();
    }
}