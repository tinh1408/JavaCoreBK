package com;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;
//public class Main{
//
//    public static void main(String[] args){
//        int $int;
//        System.out.print("A");
//    }
//    public static void main(){
//        System.out.print("B");
//    }
//    public static void start(String[] args){
//        System.out.print("C");
//    }
//}
//
public class Main {
    private static Scanner scn = new Scanner(System.in);
    static final String TIME_OPEN = "9PM";

    public static void main(String[] args) {
        int a = (int)Math.round(12 * Math.random()) + 5;
        int[] arr = {1,2,3};
        System.out.println(m(arr));
        System.out.println(m(1,2,3));
//        System.out.println(m(4.1,5.2,6.3));
        System.out.println(m());
        System.out.println("m1"+m1(1,2,3));
        System.out.println(a);
        System.out.println("Math.random()"+Math.random());
        int a4[];
        int[] a1 = {1,2,3};
       int[] a2= new int[]{1,2,3};
//         int[] a3 = new int;
        int[][] a9 = {{5, 6, 7}, {8, 9}};

        System.out.printf("--%d, %d",a9.length,a9[1].length);


    }


    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }

    static int m1(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }

}


