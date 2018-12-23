package com.ateach.pdf2.usequizabstractvsinterface;


import com.ateach.pdf2.usequizabstractvsinterface.animal.Animal;
import com.ateach.pdf2.usequizabstractvsinterface.animal.Chicken;
import com.ateach.pdf2.usequizabstractvsinterface.animal.Tiger;
import com.ateach.pdf2.usequizabstractvsinterface.edible.Edible;
import com.ateach.pdf2.usequizabstractvsinterface.fruit.Apple;
import com.ateach.pdf2.usequizabstractvsinterface.fruit.Fruit;
import com.ateach.pdf2.usequizabstractvsinterface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
