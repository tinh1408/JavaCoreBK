package com.ateach.pdf1.quizz.reviewPf1;

public class Avoid {
    int avoidObstacles(int[] inputArray) {

        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }

        return jump;
    }
}
