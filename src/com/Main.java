package com;

import com.ateach.dequy.ViDuDeQuy;

public class Main {
    public static void main(String[] args) {
        ViDuDeQuy vd = new ViDuDeQuy();
        float tong = vd.tinhTongPhanSo(5);
        System.out.println("tong: "+tong);
        System.out.println(vd.tongHaiS(3,45,6));
    }
}
