package com.han;

import java.util.Scanner;

public class CircleOfNumber {

    public static void main(String[] args) {
       circleOfNumber(10,2);

    }
    public static int circleOfNumber(int n,int firstNumber){
        int ketqua;
        if ((firstNumber + (n / 2)) > n) {
            ketqua = firstNumber + (n / 2);
        } else {
            ketqua = (firstNumber + (n / 2)) % n;
        }
        System.out.println(ketqua);
        return ketqua;
    }
}


