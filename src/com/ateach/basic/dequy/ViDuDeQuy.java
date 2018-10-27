package com.ateach.basic.dequy;

public class ViDuDeQuy {
    public static int tinhTong(int n) {
        if (n == 1) {
            return n;
        } else {
            return tinhTong(n - 1) + n;
        }
    }

    public static int add(int a, int b){
        return a*b;
    }
    public static int add(){
        return 0;
    }
    public static float add(float a, float b, float c){
        return a*b*c;
    }

    public static float tinhTongPhanSo(int n) {
        if (n == 1) {
            return n;
        } else {
            return tinhTongPhanSo(n-1 )+ ((float)1)/n;
        }
    }
}
