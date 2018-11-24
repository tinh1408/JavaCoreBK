package com.ateach.pdf1.quizz.reviewPf1;

public class isLucky {
    boolean isLucky(int n) {
        String num = Integer.toString(n); //1234 -?"1234"
        int x = 0;
        int sum1 = 0;
        int sum2 = 0;

        if(num.length()%2 == 0) {
            x = num.length()/2;
            for(int i=0; i<x ;i++) {
                sum1 += Character.getNumericValue(num.charAt(i));
            }
            for(int i=x; i<num.length() ;i++) {
                sum2 += Character.getNumericValue(num.charAt(i));
            }

            if (sum1 == sum2) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
