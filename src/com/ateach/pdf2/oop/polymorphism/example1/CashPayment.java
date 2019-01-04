package com.ateach.pdf2.oop.polymorphism.example1;

/**
 * Cash IS-A Payment type
 *
 */
class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

}

