package com.ateach.pdf2.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {

        CashPayment c = new CashPayment();
        c.pay();

        Payment p = new CashPayment();
        p.pay(); // Pay by cash

        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }

}

