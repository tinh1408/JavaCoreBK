package com.ateach.pdf2.overloading.example2;

public class TinhTong {
    static int tinhTong(int a, int b) {
        return a + b;
    }

    static int tinhTong(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        TinhTong tt = new TinhTong();
        tt.tinhTong(1,2);
    }
}
