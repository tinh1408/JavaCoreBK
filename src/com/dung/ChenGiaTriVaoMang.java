package com.dung;

import java.util.Scanner;

public class ChenGiaTriVaoMang {
    static Scanner sc = new Scanner(System.in);
    public static void chenGiaTriVaoMang() {
        int kichThuoc;
        boolean kiemTra;
        //Nhập mảng
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            kichThuoc = sc.nextInt();
            if (kichThuoc<=0){
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        int[] array = new int[kichThuoc];
        System.out.println("Nhap lan luot cac phan tu trong mang: ");
        nhapMang(array);
        //Nhập giá trị cần chèn và tiến hành chèn vào mảng
        System.out.print("Nhap gia tri can chen: ");
        int soCanChen = sc.nextInt();
        System.out.print("Vi tri can chen: ");
        int viTri = sc.nextInt();
        if (viTri<0 || viTri>=array.length){
            System.out.println("LỖI!!!");
        }else {
            for (int i=array.length-1; i>=viTri; i--){
                array[i]= array[i-1];
            }
            array[viTri-1] = soCanChen;
        }
        //In ra mảng sau khi đã chèn
        System.out.println("Mảng sau khi chèn là: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void nhapMang(int[] mang){
        for (int i=0; i<mang.length; i++){
            mang[i] = sc.nextInt();
        }
    }
}
