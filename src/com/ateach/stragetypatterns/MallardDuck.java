package com.ateach.stragetypatterns;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }
    public void display(){
        System.out.println("i'm so beautiful..., extract duck..");
    }
}
