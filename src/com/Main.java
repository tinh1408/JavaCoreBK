package com;

class ClassA{
    int a;

    public ClassA(){
        a = 300;
    }

    public void callClassB(){
        ClassB obj = new ClassB();
        System.out.println("a cua Test B: "+obj.a);
        System.out.println("a cua Test A: "+this.a);
    }
}

class ClassB{
    int a;
    public ClassB(){
        a = 200;
    }
}

public class Main {
    public static void main(String[] args) {
        ClassA ts = new ClassA();
        ts.callClassB();
    }
}

