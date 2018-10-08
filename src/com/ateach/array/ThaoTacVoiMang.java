package com.ateach.array;

import java.util.Scanner;

public class ThaoTacVoiMang {

   public static void themPhanTuVaoCuoi(){
       String[] arrStr = new String[]{"item1","item2","item3"};
       int newSize = arrStr.length+1;

       String[] arrNewStr = new String[newSize];
       for(int i =0; i < arrStr.length;i++){
            arrNewStr[i] = arrStr[i];
       }
       arrNewStr[newSize-1] = "LastItem";
       for (int k = 0; k <arrNewStr.length; k++){
           System.out.println(arrNewStr[k]);
       }
   }

   public static void themPhanTuVaoDau(){
       String[] arrStr = new String[]{"item1","item2","item3"};
       int newSize = arrStr.length+1;
       String[] arrNewStr = new String[newSize];
       arrNewStr[0] = "FistItem";
       for(int i = 0; i<arrStr.length;i++){
           arrNewStr[i+1] = arrStr[i];
       }

   }

   public static void themPhanTuVaoGiua(){
       String[] arrStr = new String[]{"item1","item2","item3"};
       int newSize = arrStr.length+1;
       String[] arrNewStr = new String[newSize];
       //B1. sao chep mang A sang mang new
       for(int k= 0;k<arrStr.length;k++){
           arrNewStr[k] = arrStr[k];
       }
       //B2. Nhap vi tri va gia tri
       Scanner scn = new Scanner(System.in);
       System.out.println("Vi tri: ");
       int viTri = scn.nextInt();
       System.out.println("Gia tri:");
       String giaTri = scn.next();
       //B3. dich chuyen
       for(int i = arrNewStr.length-1; i> viTri-1;i--){
           System.out.println("i:="+i);
           arrNewStr[i] = arrNewStr[i-1];
       }
       //B4/ gan gia tri
        arrNewStr[viTri] = giaTri;
       //B4. In ra
       for (int j = 0; j <arrNewStr.length; j++){
           System.out.println(arrNewStr[j]);
       }
   }

   public static void xoaPhanTuDauTien(){
       String[] arrStr = new String[]{"item1","item2","item3"};
       int newSize = arrStr.length-1;
       String[] arrNewStr = new String[newSize];
       for(int i=1; i<arrStr.length;i++){
           arrNewStr[i-1] = arrStr[i];
       }
       for (int k = 0; k <arrNewStr.length; k++){
           System.out.println(arrNewStr[k]);
       }
   }

   public static void xoaPhanTuCuoiCung(){
       String[] arrStr = new String[]{"item1","item2","item3"};
       int newSize = arrStr.length-1;
       String[] arrNewStr = new String[newSize];
       for(int i=0;i<arrStr.length-1;i++){
           arrNewStr[i] = arrStr[i];
       }
       for (int k = 0; k <arrNewStr.length; k++){
           System.out.println(arrNewStr[k]);
       }
   }

    public static void xoaPhanTuGiua(){
        String[] arrStr = new String[]{"item1","item2","item3"};
        int newSize = arrStr.length+1;
        String[] arrNewStr = new String[newSize];
        //B1. sao chep mang A sang mang new
        for(int k= 0;k<arrStr.length;k++){
            arrNewStr[k] = arrStr[k];
        }
        //B2. Nhap vi tri va gia tri
        Scanner scn = new Scanner(System.in);
        System.out.println("Vi tri xoa: ");
        int viTri = scn.nextInt();
        //B3. dich chuyen
        for(int i = arrNewStr.length-1; i> viTri;i--){
            arrNewStr[i] = arrNewStr[i];
        }

        //B4. In ra
        for (int j = 0; j <arrNewStr.length; j++){
            System.out.println(arrNewStr[j]);
        }

    }
}
