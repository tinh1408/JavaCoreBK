package com.ateach.medium;

public class KhachHang {
    static public int id;
    public String hoTen;
    int soDienThoai;
    public void show(){
        System.out.println(soDienThoai);
    }
}

class QuanLy{
    public static void main(String[] args) {
        KhachHang obj = new KhachHang();
        System.out.println(obj.hoTen);
        System.out.println(obj.soDienThoai);
    }
}

