package com.ateach.pdf2.collectionFrameWork;

import java.util.*;

class SinhVien{
    public SinhVien(String ten, int diem) {
        this.ten = ten;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", diem=" + diem +
                '}';
    }

    String ten;
    int diem;
}

class TreeMapTest {

    public static void main(String args[]) {
       String s = "lioo";
       String s1 = "liemmmmmmmmmnnn";
        System.out.println(s.compareTo(s1));

    }
}
