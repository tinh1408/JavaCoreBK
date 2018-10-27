package com.han.newpkg;

import java.util.Scanner;
import java.lang.String;
public class QuanXe {
    public static void main(String[] args) {
        int[] args1 = new int[]{1,2,3,4,5,6,7,8};
        Scanner scn = new Scanner(System.in);
        String vitri;
        char[] args2 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String[][] arr = new String[8][8];
        for (int i = 0; i < args1.length; i++) {
            for (int j = 0; j < args2.length; j++) {
                arr[i][j] = args1[i] + String.valueOf(args2[j]);
                System.out.print(arr[i][j]);
                if (j == arr.length - 1) System.out.println();
                //-------------------------------------

            }
        }
        vitri=scn.next();
        for(int i=0;i<args1.length;i++) {
            if(args1[i]!=(int)vitri.charAt(0)-48) System.out.print(args1[i]+String.valueOf(vitri.charAt(1))+"\t");
        }
        for(int i=0;i<args2.length;i++){
            if(args2[i]!=vitri.charAt(1)) System.out.print(String.valueOf(vitri.charAt(0))+args2[i]+"\t");
        }
    }
}
