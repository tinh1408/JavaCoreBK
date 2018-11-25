package com.ateach.pdf2.inheritance.example1;

/**
 * This is subclass (also called as derived or child or extended) Dog which is extending Animal
 */

class Dog extends Animal {

    // Own behavior 'sua'
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}
