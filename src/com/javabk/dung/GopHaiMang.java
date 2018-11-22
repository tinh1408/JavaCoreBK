package com.javabk.dung;

import java.util.Scanner;

public class GopHaiMang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array1, array2;
        int kichThuocMang1, kichThuocMang2;
        boolean kiemTraNhap;
        //nhập kích thước 2 mảng
        do {
            System.out.println("Nhap kich thuoc mang 1: ");
            kichThuocMang1 = sc.nextInt();
            System.out.println("Nhap kich thuoc mang 2: ");
            kichThuocMang2 = sc.nextInt();
            if (kichThuocMang1<=0 || kichThuocMang2<=0){
                System.out.println("Lỗi. Nhập lại!!!");
                kiemTraNhap = true;
            }else kiemTraNhap = false;
        }while (kiemTraNhap);
        array1 = new int[kichThuocMang1];
        //Nhập các giá trị cho các phần tử mảng
        System.out.println("Nhap cac phan tu mang 1");
        nhapMang(array1);
        array2 = new int[kichThuocMang2];
        System.out.println("Nhap cac phan tu mang 2");
        nhapMang(array2);
        //Gộp mảng
        int kichThuocMang3 = kichThuocMang1 + kichThuocMang2;
        int[] array3 = new int[kichThuocMang3];
        for (int i=0; i<array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i=0; i<array2.length; i++){
            array3[i+array1.length] = array2[i];
        }
        //In kết quả
        System.out.println("Mang sau khi gop la: ");
        for (int i=0; i<array3.length; i++){
            System.out.print(array3[i] + " ");
        }
    }
    public static void nhapMang(int[] mang){
        for (int i=0; i<mang.length; i++){
            mang[i] = sc.nextInt();
        }
    }
}
