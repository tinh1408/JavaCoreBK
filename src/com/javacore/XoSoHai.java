package com.javacore;

import java.util.Random;
import java.util.Scanner;

public class XoSoHai {
    static boolean ktDocDac, ktGiaiNhi, ktGiaiBa = false;
    public void xoSoCachHai(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int lottery = 99;

        System.out.println("Nhap so dau tien cua so du doan: ");
        byte guessDigit1 = sc.nextByte();
        System.out.println("Nhap so thu hai cua so du doan: ");
        byte guessDigit2 = sc.nextByte();

        ktDocDac = (guessDigit1*10 + guessDigit2) == lottery;
        ktGiaiNhi = (guessDigit2*10 + guessDigit1) == lottery;

        char[] str = String.valueOf(lottery).toCharArray();
        char soThu1 = Integer.toString(guessDigit1).charAt(0);
        char soThu2 = Integer.toString(guessDigit2).charAt(0);
        for (int i=0; i<str.length; i++){
            if (soThu1 == str[i] || soThu2 == str[i]){
                ktGiaiBa = true;
                break;
            }
        }
        if (ktDocDac){
            System.out.println("Ban da trung doc da voi phan thuong $10000");
        }else if (ktGiaiNhi){
            System.out.println("Ban da trung giai nhi voi phan thuong $3000");
        }else if (ktGiaiBa){
            System.out.println("Ban da trung giai ba voi phan thuong $1000");
        }else System.out.println("Chuc ban may man lan sau");
        System.out.println("Giai doc dac la: "+ lottery);
    }
}
