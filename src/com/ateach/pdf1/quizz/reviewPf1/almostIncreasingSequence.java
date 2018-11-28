package com.ateach.pdf1.quizz.reviewPf1;

public class almostIncreasingSequence {
    boolean almostIncreasingSequence(int[] sequence) {
        boolean issq = true;
        for(int i = 0; i <sequence.length-1; i ++){
            if((sequence[i+1]-sequence[i]) ==1){
                issq = true;
            }else{
                issq = false;
                break;
            }
        }
        return issq;
    }
}
