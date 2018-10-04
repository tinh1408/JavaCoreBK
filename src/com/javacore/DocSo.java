package com.javacore;

import java.util.Scanner;

public class DocSo {
   public void chuyenSoThanhChu(){
       int soCanDoc;
       Scanner scn = new Scanner(System.in);
       System.out.println("Nhap so can doc: " );
       soCanDoc = scn.nextInt();

       int hangTram = soCanDoc/100;
       int hangChuc = soCanDoc%100;
       int hangDonVi = soCanDoc %10;

        if(hangTram !=0){
            docHangDonVi(hangTram);
            System.out.print("hundred and ");
        }
        if(hangChuc !=0 &&(hangChuc>22)){
           docHangTy(hangChuc/10);
           docHangDonVi(hangChuc%10);
        }else if(hangChuc>=10 && hangChuc <22){
            docHangTeen(hangChuc);
        }
        else {
            docHangDonVi(hangDonVi);
        }
   }

    private static void docHangDonVi(int soDonvi){
        switch (soDonvi){
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;


        }
    }
    private static void docHangTy(int strHangChuc){
        switch (strHangChuc){
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }
    private static void docHangTeen(int strHangteen){
        switch (strHangteen){
            case 10:
                System.out.print("ten ");
                break;
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twelve ");
                break;
            case 13:
                System.out.print("thirteen ");
                break;
            case 14:
                System.out.print("twelve");
                break;
            case 15:
                System.out.print("thirteen ");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print("seventeen ");
                break;
            case 18:
                System.out.print("eighteen ");
                break;
            case 19:
                System.out.print("nineteen ");
                break;
            case 20:
                System.out.print("twenty ");
                break;
        }
    }

}
