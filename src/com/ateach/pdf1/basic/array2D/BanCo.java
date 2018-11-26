package com.ateach.pdf1.basic.array2D;

import java.util.Scanner;

public class BanCo {
    public static void duongDiQuanXe() {

        String[] chieuNgang = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] chieuDoc = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[][] banCoMoi = new String[8][8];

        for (int i = 0; i < chieuNgang.length; i++) {
            for (int j = chieuDoc.length - 1; j >= 0; j--) {
                String giaTri = chieuNgang[i] + "" + chieuDoc[j];
                banCoMoi[i][j] = giaTri;
            }
        }
        inMang(banCoMoi);

        System.out.println(" Nhap vi tri cua quan xe: ");
        Scanner scn = new Scanner(System.in);
        String viTriXe = scn.next();
        int soViTri = Integer.parseInt(viTriXe.substring(0, 1));
        System.out.println(soViTri);

        //duyet qua cot
        for (int i = 0; i < banCoMoi.length; i++) {
            System.out.print(banCoMoi[i][soViTri - 1] + " ");

        }
        //duyet qua dong
        for (int i = 0; i < banCoMoi.length; i++) {
            System.out.print(banCoMoi[soViTri - 1][i] + " ");
        }
    }

    public static void inMang(String arrs[][]) {
        System.out.println("mang in ra: ");
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println();
        }
    }
}
