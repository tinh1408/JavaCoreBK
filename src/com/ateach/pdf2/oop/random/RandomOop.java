package com.ateach.pdf2.oop.random;

import java.util.Random;

public class RandomOop {
    public  int seed;
    public RandomOop(int seeds) {
        this.seed = seeds;
    }

    public void getRandomValue(){
        Random random1 = new Random(this.seed);
        for (int i = 0; i < 50; i++) {
            System.out.print(random1.nextInt(100) + " ");
        }
    }
}
