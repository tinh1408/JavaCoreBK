package com.ateach.pdf2.oop.grocery;

public interface Item {
    double getPrice();
    double getDiscount(DiscountCondition[] discountConditions);
    String getInfo();
    boolean supportDiscountCondition(DiscountCondition discountCondition);
}
