package com.ateach.pdf2.abstraction.example1;

// Nha thau
public class Boss extends Employee {

    private int workingHours;

    public Boss(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}