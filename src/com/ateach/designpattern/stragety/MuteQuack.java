package com.ateach.designpattern.stragety;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence....");
    }
}
