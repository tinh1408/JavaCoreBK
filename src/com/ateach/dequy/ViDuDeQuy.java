package com.ateach.dequy;

public class ViDuDeQuy {
    public static int tinhTong(int n) {
        if (n == 1) {
            return n;
        } else {
            return tinhTong(n - 1) + n;
        }
    }

    public static float tinhTongPhanSo(int n) {
        if (n == 1) {
            return n;
        } else {
            return tinhTongPhanSo(n-1 )+ ((float)1)/n;
        }
    }

}
