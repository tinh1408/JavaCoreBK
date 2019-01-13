package com.ateach.cake;

import java.util.Scanner;

public class ReadymadeCake extends Cake {
    int quantity;


    public ReadymadeCake() {

        this.quantity = 0;
    }

    public ReadymadeCake(String name, int rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    /* Add info for Order cake, this's method inheritance method addInfo of class Cake (name, rate) */
    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        super.addInfo();
        System.out.println("Enter quality of order cake: ");
        quantity = sc.nextInt();
    }

    public String toString() {
        return "" + super.toString() + "quantity: " + quantity + "";
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }
}
