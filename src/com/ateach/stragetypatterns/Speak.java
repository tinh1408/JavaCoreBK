package com.ateach.stragetypatterns;

public class Speak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Speak...");
    }
}
