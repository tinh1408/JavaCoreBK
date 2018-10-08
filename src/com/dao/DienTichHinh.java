package com.dao;

import java.util.Scanner;

public class DienTichHinh {
    public static void dienTinhHinhTron(){
        System.out.println("Tinh dien tich va chu vi hinh tron");
        Float r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ban kinh");
            r = sc.nextFloat();
        }
        while (r<0);
        Float Dientich = ((314*r*r)/100);
        System.out.println("Dien tich hinh tron la:" + Dientich);

        Float d;
        do {
            System.out.println("Nhap duong kinh");
            d = sc.nextFloat();
        }
        while (d<0);
        Float Chuvi = ((314*d)/100);
        System.out.println("Chu vi hinh tron la:" + Chuvi);
    }
}
