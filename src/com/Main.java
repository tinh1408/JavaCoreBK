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

        String a = "abcacba";
        char[] sr = a.toCharArray();
        boolean kt = true;
        for (int i = 0; i < sr.length; i++) {
            if (sr[i] != sr[sr.length - i - 1]) {
                kt = false;
                break;
            }
        }
        if (kt == true) {
            System.out.println("doi xung");
        } else {
            System.out.println("khong phai la chuoi doi xung");
        }

    }

}


