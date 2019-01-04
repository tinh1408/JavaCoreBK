package com.ateach.pdf2.oop.inheritance.example3;

public class DongVat {
    String loai;

    DongVat() {
        loai = "bo sat";
    }

    void taoAmThanh() {
        System.out.println("Am thanh cua dong vat");
    }
}

class RanNuoc extends DongVat {
    String noiSong;

    RanNuoc() {
        noiSong = "Tren can";
    }

    void hienThongTin() {
        System.out.println("loai " + super.loai + " noi song " + noiSong);
    }

    void amThanhCuaRan() {
        super.taoAmThanh();
        System.out.println("Khè khè");
    }
}

class Manager {
    public static void main(String[] args) {
        RanNuoc objr = new RanNuoc();
        objr.hienThongTin();
        objr.amThanhCuaRan();

    }
}