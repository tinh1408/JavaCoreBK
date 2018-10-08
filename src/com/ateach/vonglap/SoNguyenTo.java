package com.ateach.vonglap;

public class SoNguyenTo {
    // TODO code application logic here


    public static void inRaSoNguyenTo(){

      for(int i = 0; i < 20; i ++){
          if(kiemTraSoNguyenTo2(i)){
              System.out.println(i);
          }
      }
    }

    public static boolean kiemTraSoNguyenTo(int n){
        if( n == 0 || n == 1) return false;
        for(int i =  2; i<= n -1; i ++){
            if ( n % i == 0) return false;
        }
        return true;
    }
   public static boolean kiemTraSoNguyenTo2(int n)
    {
        // Neu n < 2 thi khong phai la SNT
        if (n < 2){
            return false;
        }

        // Neu n = 2 la SNT
        if (n == 2){
            return true;
        }

        // Neu n la so chan thi ko phai la SNT
        if (n % 2 == 0){
            return false;
        }

        // Lap qua cac so le
        for (int i = 3; i < (n - 1); i += 2){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
