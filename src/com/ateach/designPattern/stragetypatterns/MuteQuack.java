package com.ateach.designPattern.stragetypatterns;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence....");
    }
}
