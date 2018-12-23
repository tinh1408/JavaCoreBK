package com.ateach.pdf2.usequizabstractvsinterface.animal;


import com.ateach.pdf2.usequizabstractvsinterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
