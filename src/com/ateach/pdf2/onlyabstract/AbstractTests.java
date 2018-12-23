package com.ateach.pdf2.onlyabstract;
import com.ateach.pdf2.onlyabstract.animal.Animal;
import com.ateach.pdf2.onlyabstract.animal.Chicken;
import com.ateach.pdf2.onlyabstract.animal.Tiger;
import com.ateach.pdf2.onlyabstract.fruit.Apple;
import com.ateach.pdf2.onlyabstract.fruit.Fruit;
import com.ateach.pdf2.onlyabstract.fruit.Orange;

public class AbstractTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Animal edibler = animal;
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
