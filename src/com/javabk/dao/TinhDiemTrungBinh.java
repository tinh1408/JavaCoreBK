package com.javabk.dao;

import java.util.Scanner;

public class TinhDiemTrungBinh {
    public void diemTrungBinh() {
        System.out.println("Hello World!");
        System.out.println("Tinh diem trung binh va diem tong");

        float diemhoahoc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap diem hoa hoc 0-10");
            diemhoahoc = sc.nextFloat();
        } while ((diemhoahoc < 0) || (diemhoahoc > 10));
        float diemsinhhoc;
        do {
            System.out.println("Nhap diem sinh hoc 0-10");
            diemsinhhoc = sc.nextFloat();
        } while ((diemsinhhoc < 0) || (diemsinhhoc > 10));
        float diemvatly;
        do {
            System.out.println("Nhap diem vat ly 0-10");
            diemvatly = sc.nextFloat();
        } while ((diemvatly < 0) || (diemvatly > 10));
        Float diemtong = diemhoahoc + diemsinhhoc + diemvatly;
        System.out.println("tinh diem tong : " + diemtong + " Diem tong 3 mon");
        Float diemtrungbinh = diemtong / 3;
        System.out.println("Tinh diem trung binh : " + diemtrungbinh + " Diem trung binh 3 mon ");

    }
}
