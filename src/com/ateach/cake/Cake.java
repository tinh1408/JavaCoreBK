package com.ateach.cake;

import java.util.Scanner;

public class Cake {
    protected String name;
    protected double rate;

    public Cake() {

    }

    public Cake(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double calcPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Info of cake: Name: " + name + "\tRate: " + rate;
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of cake :");
        name = sc.next();
        System.out.println("Rate of cake :");
        rate = sc.nextDouble();
    }
}