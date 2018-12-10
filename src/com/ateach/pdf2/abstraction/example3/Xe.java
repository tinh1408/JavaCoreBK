package com.ateach.pdf2.abstraction.example3;

abstract class Xe {
    abstract void khoiDong();

    abstract void tatMay();
}

abstract class DongCo{
    abstract void dongCoHaiThi();
}
interface mauSon{
    void mauSonNuocBien();
    void mauSonSoCoLa();
}


class XeMay extends Xe {


    @Override
    void khoiDong() {
        System.out.println("Xe may khoi dong");
    }

    @Override
    void tatMay() {
        System.out.println("Xe may tat may");
    }

}

class Manager{
    public static void main(String[] args) {
        Xe ojb = new XeMay();
        ojb.khoiDong();
    }
}