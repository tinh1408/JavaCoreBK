package com;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    static final String TIME_OPEN = "9PM";

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String s = scn.next();
        String[] bytes = s.split("\\.", 4);
        System.out.println(Arrays.toString(bytes));
        String a = "abccba";
        char[] sr = a.toCharArray();
        boolean kt = true;
        for(int i = 0; i<sr.length+1;i++){
            if(sr[i] != sr[sr.length-i]){
                kt = false;
                break;
            }
        }
        if(kt == true)

    }

}


