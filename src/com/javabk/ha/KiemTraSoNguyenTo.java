package com.javabk.ha;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void SoNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào một số n = ");
        n = scanner.nextInt();
        if(n>2)
        {
            System.out.println(n + "is not a prime");
        }
        else
        {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(n + " is a prime");
            else
                System.out.println(n + " is not a prime");
        }
    }
}
