package com.ateach.pdf2.oop.polymorphism.example1;

/**
 * Creditcard IS-A Payment type
 */
class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }
}
