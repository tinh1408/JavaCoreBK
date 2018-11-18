package com.ateach.designPattern.stragetypatterns;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("The duck flying with rocket");
    }
}