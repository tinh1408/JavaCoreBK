package com.ateach.pdf2.oop.inheritance.person;

import java.util.Scanner;

public class Person {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Person(){
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter address: ");
        address = sc.next();
    }
    public String toString(){
        return " Name: " + name + ", Address: " + address + "";
    }

}
