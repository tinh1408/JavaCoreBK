    package com.thu;

import java.util.Scanner;

public class CauLenhLap {
    public static void soNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        int number =2;
        int demSoNguyenTo= 0;
        while (demSoNguyenTo<20){
            for (int i = 2; i <number -1 ; i++) {
                if (number%i ==0){
                    number++;
                    i=2;
                }
            }
            System.out.println(number + " ");
            demSoNguyenTo++;
            number++;
        }
    }
    public static void hienThiCacLoaiHinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * ");
                    System.out.println(" * * * * ");
                    System.out.println("  * * * ");
                    System.out.println("    *  ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
    public static void soNguyenToNhoHon100() {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (kiemtrasonguyen(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean kiemtrasonguyen(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void UCLN(){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("nhap so nguyen duong a la:");
        a = scanner.nextInt();

        System.out.println("nhap so nguyen duong b la:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a ==0 || b==0);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN:" +a);
    }
}
