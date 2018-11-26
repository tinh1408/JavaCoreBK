package com.ateach.pdf2.abstraction.example1;

public class Developer extends Employee {

    public Developer(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}

