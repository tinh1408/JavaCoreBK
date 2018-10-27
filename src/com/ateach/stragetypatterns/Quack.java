package com.ateach.stragetypatterns;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack..");
    }
}
