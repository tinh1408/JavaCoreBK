package com.han;

import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        System.out.println(Symmetry("assddss"));
        if (Symmetry("aabaa")) System.out.println("day la day doi xung");
        else System.out.println("day 0 phai la day doi xung");


    }

    public static boolean Symmetry(String inputString) {
        Scanner scn = new Scanner(System.in);
        boolean checkSymnetry = false;
        char[] args = inputString.toCharArray();
        for (int i = 0; i < args.length / 2; i++) {
            if (args[i] == args[args.length - 1 - i]) checkSymnetry = true;
            else checkSymnetry = false;
        }
        return checkSymnetry;
    }
}
