package com.ateach.pdf2.oop.inheritance.person;

import java.util.Scanner;

public class Staff extends Person {
    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff() {
        super();
        school = "";
        pay = 0;
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void addInfoStaff() {
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter school: ");
        school = sc.next();
        System.out.println("Enter pay (double): ");
        pay = sc.nextDouble();
    }

    public String toString() {
        return "Staff info: " + super.toString() + ", school: " + school + ", pay: " + pay + "";
    }
}
