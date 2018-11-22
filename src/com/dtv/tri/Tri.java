package com.dtv.tri;

import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {
        Bai1();
        Bai2();
        Bai3();
        Bai4();
    }

    public static void Bai1() {
        int dem = 1;
        int n = 2;
        do {
            if (soNguyenTo(n)) {
                System.out.print(" " + n);
                dem++;
            }
            n++;
        } while (dem <= 20);
    }

    public static boolean soNguyenTo(int n) {
        for (int i = 2; i <= (float) Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void Bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap nam: ");
        int nam = sc.nextInt();
        int TheKy = (nam / 100) + 1;
        System.out.println("\nNam " + nam + " thuoc the ky thu: " + TheKy);
    }

    public static void Bai3() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println(" ");
        }
    }

    public static void Bai4() {
        int i, j, k, q = 4;
        System.out.println("Hinh bai 4");
        for (i = 1; i <= q; i++) {
            for (j = 1; j <= q - i; j++)
                System.out.print(" ");
            for (k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
        for (i = 2; i <= q; i++) {
            for (j = 3; j > q - i; j--)
                System.out.print(" ");
            for (k = q; k >= i; k--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
