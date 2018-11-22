package com.javabk.han.newpkg;

public class Recusiver2 {
    public static void main(String[] args){
        System.out.println(Sum(2));
    }
    public static int Sum(int n){
        if(n==1) return 1;
        return (n*n)+Sum(n-1);
    }
}
