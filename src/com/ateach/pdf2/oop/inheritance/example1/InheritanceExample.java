package com.ateach.pdf2.oop.inheritance.example1;

//Inheritance - IS-A relationship between a superclass and its subclasses.
public class InheritanceExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); //upcasting->reference variable of parent class
        dog.setId(123); // inherited from super class
        dog.sound(); // overrided behavior of sub class
    }
}

