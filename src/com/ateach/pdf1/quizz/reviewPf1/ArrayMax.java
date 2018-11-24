package com.ateach.pdf1.quizz.reviewPf1;

public class ArrayMax {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max=0;
        for( int i = 1 ; i < inputArray.length ; i++ ){
            max = Math.max(max, Math.abs(inputArray[i] - inputArray[i-1]));
        }
        return max;
    }
}
