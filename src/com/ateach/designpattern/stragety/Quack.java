package com.ateach.designpattern.stragety;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack..");
    }
}
