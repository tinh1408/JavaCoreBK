package com.ateach.pdf2.oop.account;

import java.text.SimpleDateFormat;
import java.util.Date;

class AccountTest {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Account ac = new Account();
        ac.setId(111);
        ac.setBalance(20);
        ac.setDateCreated(date);
        ac.setAnnualInterestRate(4.5); // lai suat 1 nam 4.5$
        ac.withdraw(2.5); // rut 2.5$
        ac.deposit(3); // them vao 3$

        System.out.println("Account id: "+ac.getId());
        System.out.println("Date create account: " + formatter.format(ac.getDateCreated()));
        System.out.println("Balance: " + ac.getBalance());
        System.out.println("Monthly Interest Rate: " + ac.getMonthlyInterestRate());
    }
}