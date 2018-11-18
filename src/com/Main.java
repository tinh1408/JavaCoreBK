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
        System.out.println(a);

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


