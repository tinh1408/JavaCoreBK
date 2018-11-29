package com.ateach.pdf2.account;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0; // lãi suất hàng năm

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    private Date dateCreated;

    Account() {
        id = 100;
        balance = 0;
    }

    // lấy lãi suất hàng tháng
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    // rut tien
    public double withdraw(double monneyWithdraw) {
        return balance = (balance * getMonthlyInterestRate())+balance - monneyWithdraw;
    }

    // them tien vao tai khoan
    public void deposit(int monney) {
        balance = balance + monney;
    }


    // so phan tram lai hang thang = (4.5/100/12) = 0.00375

    // neu tien goc la 20$ thi sau 1 thang lai dc 20$*0.00375 + 20$ = 20.075$

    // rut 2.5$ = 20.075 - 2.5 = 17.575
    // cong them 3$ = 17.575 + 3 = 20.575

}
