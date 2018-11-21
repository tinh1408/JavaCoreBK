package com.ateach.designpattern.stragety;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly..."); // for rube duck, decoy duck
    }
}
