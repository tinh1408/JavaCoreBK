package com.ateach.designpattern.stragety;

public class Speak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Speak...");
    }
}
