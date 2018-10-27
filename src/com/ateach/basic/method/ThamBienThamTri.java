package com.ateach.basic.method;

public class ThamBienThamTri {

    public  static void goiHam(){
//        int giaTriGoc = 10;
//        truyenThamTri(giaTriGoc);
//        System.out.println("Gia tri sau khi goi: "+ giaTriGoc);

        int [] mangGoc = {400,500};
        System.out.println("Gia tri ban dau: " + mangGoc[0] + " " +mangGoc[1]);
        truyenThamChieu(mangGoc);
        System.out.println("Gia tri sau khi goi ham: "+ mangGoc[0] + "  "+ mangGoc[1]);
    }

    static void truyenThamTri(int bien)
    {
        bien = 20;
    }

    static void truyenThamChieu(int mang[]){
        mang[0] = 200;
        mang[1] = 100;
    }
}
