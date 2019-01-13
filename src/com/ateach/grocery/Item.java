package com.ateach.grocery;

public interface Item {
    double getPrice();
    double getDiscount(DiscountCondition[] discountConditions);
    String getInfo();
    boolean supportDiscountCondition(DiscountCondition discountCondition);
}
