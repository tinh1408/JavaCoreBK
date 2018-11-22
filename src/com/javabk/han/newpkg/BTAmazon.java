package com.javabk.han.newpkg;
import java.lang.String;
public class BTAmazon {

    public static char kiemTra(String s) {
        int dem = 0;
        char kitu='_';
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length - 1; j++) {
                if (ch[i] == ch[j])
                    dem++;
            }
            if (dem == 0) {
                kitu =  ch[i];
                break;
            }
            dem=0;
        }
        return kitu;
    }

    // cach 1 su dung vong 2 vong for

    public static char firstNotRepeatingCharacterCase1(String str){
        char chReturn = '_';
        char[] argStr = str.toCharArray();
        int dem = 0;
        for(int i = 0; i < argStr.length; i++){
            for (int j = 0; j < argStr.length; j++ ){
                if(argStr[i] == argStr[j]){
                    dem++;
                }
            }
            if(dem > 1){ // no xuat hien nhieu hon 1 lan trong chuoi thi reset dem=0
                dem = 0;
            }else{
                chReturn = argStr[i];
                break;
            }

        }
        return chReturn;
    }

     // cach 2:  chi su dung 1 vong for
     public static char firstNotRepeatingCharacterCase2(String s) {
         char[] c = s.toCharArray();
         System.out.println(s.indexOf("c"));
         System.out.println(s.lastIndexOf("c"));
         System.out.println("----------------");
         System.out.println(s.indexOf("b"));
         System.out.println(s.lastIndexOf("b"));
         for(int i = 0; i < s.length(); i++){
             if(s.indexOf(c[i]) == s.lastIndexOf(c[i]))
                 return c[i];
         }
         return '_';
     }
}
