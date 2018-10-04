package com.javacore;

import java.util.Scanner;

public class SoNguyenTo {
    // TODO code application logic here


    public static void inRaSoNguyenTo(){
      for(int i = 0; i < 20; i ++){
          if(kiemTraSoNguyenTo(i)){
              System.out.println(i);
          }
      }
    }


    public static boolean kiemTraSoNguyenTo(int n){
        if( n == 0 || n == 1) return false;
        for(int i = 2; i<= n -1; i ++){
            if ( n % i == 0) return false;
        }
        return true;
    }
}
