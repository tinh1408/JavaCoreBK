package com.ateach.pdf2.onlyabstract.animal;



public class Chicken extends Animal  {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }
}
