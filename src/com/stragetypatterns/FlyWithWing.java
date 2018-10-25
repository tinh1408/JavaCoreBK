package com.stragetypatterns;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying..");
    }
}
