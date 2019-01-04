package com.ateach.pdf2.oop.exercise;

class Animal {
}

class Dog1 extends Animal {

    public static void main(String args[]) {
        Dog1 d = new Dog1();
        System.out.println(d instanceof Animal);//true
    }
}