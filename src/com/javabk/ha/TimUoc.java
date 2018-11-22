package com.javabk.ha;

import java.util.Scanner;

public class TimUoc {
    public static void UCLN(){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số a");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b");
        b= scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0)
        {
            System.out.println(" no greatest common factor");
            System.out.println("Done !");
        }
        while ( a!= b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        System.out.println(" Greatest common factor: " + a );
    }
}
