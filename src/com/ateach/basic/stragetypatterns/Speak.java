package com.ateach.basic.stragetypatterns;

public class Speak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Speak...");
    }
}
