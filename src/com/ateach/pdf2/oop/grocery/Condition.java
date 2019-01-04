package com.ateach.pdf2.oop.grocery;

public class Condition implements DiscountCondition{
    private String nameOfCustomer;

    private String discountName;
    private double discountAmount;

    public Condition(String nameOfCustomer, String discountName, double discountAmount) {
        this.nameOfCustomer = nameOfCustomer;
        this.discountName = discountName;
        this.discountAmount = discountAmount;
    }

    public boolean willGetDiscount(){
        return nameOfCustomer != null && nameOfCustomer.equals(discountName);
    }

    @Override public String getNameOfCondition() {
        return "Condition";
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
