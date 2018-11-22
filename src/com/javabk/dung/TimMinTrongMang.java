package com.javabk.dung;

import java.util.Scanner;

public class TimMinTrongMang {
    static Scanner sc = new Scanner(System.in);
    public static void timGiaTriNhoNhatTrongMang() {
        //Nhập kích thước mảng và các phần tử của mảng
        boolean kiemTra;
        int kichThuocMang;
        do {
            System.out.println("Nhap kich thuoc mang: ");
            kichThuocMang = sc.nextInt();
            if (kichThuocMang<=1){
                System.out.println("Kich thuoc mang phai lon hon 2!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        int[] array = new int[kichThuocMang];
        System.out.println("Nhap cac phan tu cua mang!");
        nhapMang(array);
        //Tìm và in ra giá trị nhỏ nhất
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("MIN = "+min);
    }
    public static void nhapMang(int[] mang){
        for (int i=0; i<mang.length; i++){
            mang[i] = sc.nextInt();
        }
    }
}
