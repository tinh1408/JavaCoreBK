package com.ateach.cake;

import java.util.Scanner;

public class OrderCake extends Cake {
    int weight;

    public OrderCake() {
        this.weight = 0;
    }

    public OrderCake(String name, int rate, int weight) {
        super(name, rate);
        this.weight = weight;
    }

    /* Add info for Order cake, this's method inheritance method addInfo of class Cake (name, rate) */
    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        super.addInfo();
        System.out.println("Enter weight of order cake: ");
        weight = sc.nextInt();
    }

    public String toString() {
        return "" + super.toString() + "Weight of Order cake: " + weight + "";
    }

    /* Return price of Order cake*/
    @Override
    public double calcPrice() {
        return rate * weight;
    }


}
