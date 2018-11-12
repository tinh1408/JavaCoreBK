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
        int so = 6; if (so % 2 == 0) {
            System.out.println("A"); }
        if (so % 3 == 0){
            System.out.println("B");
        }

        int year = 2018; if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("X"); } else {
            System.out.println("Y");
        }
//        int a = 5; int b = 7; int c = a++ + ++b;
//        System.out.println(c);
    }
}

