package com.javacore;

import java.util.Random;
import java.util.Scanner;

public class XoSo {

    public static void xoSoKienThiet(){
        Random rd = new Random();
        int bound;
        //int rds = rd.nextInt(bound = 99);
        // gia su so doc dac la 18
        int soRandom = 18;
        System.out.println(" rds = " + soRandom);
        Scanner scanner = new Scanner(System.in);
        int guessDigit1;
        int guessDigit2;
        boolean gtri;
        do
        {
            System.out.println(" Nhập vào guessDigit1 : ");
            guessDigit1 = scanner.nextInt();
            System.out.println(" Nhập vào guessDigit2 : ");
            guessDigit2 = scanner.nextInt();
            gtri= true;
            int soThuNhat = soRandom /10;
            int soThuHai = soRandom%10;
            int soDao = soThuHai *10 + soThuNhat; // thu hien dao so
            if ((guessDigit1 < 10 && guessDigit1 >= 0) && (guessDigit2 < 10 && guessDigit2 >= 0)) {
                int docDac = guessDigit1 * 10 + guessDigit2;
                if (docDac == soRandom) {
                    System.out.println("Chúc Bạn đã trúng số đặc biệt !");
                    System.out.println(" Giải thưởng của bạn là : 10000 USD");
                }else if (docDac == soDao) {
                    System.out.println("Chúc mừng bạn đã trúng giải nhì !");
                    System.out.println("Tiền thưởng của bạn là : 3000 USD");
                }else if  (guessDigit1 == soThuNhat || guessDigit2 == soThuNhat || guessDigit1 == soThuHai || guessDigit2 == soThuHai){
                    System.out.println("Chúc mừng bạn đã trúng giải ba , số có 1 chữ số ");
                    System.out.println("Tiền thưởng của bạn là 1000 USD");
                }else{
                    System.out.println("Chúc bạn may mắn lần sau");
                }
            } else {
                gtri = false;
                System.out.println("Giá trị vừa nhập không hợp lệ , yêu cầu nhập lại");
            }
        }
        while (gtri = true);
    }
}
