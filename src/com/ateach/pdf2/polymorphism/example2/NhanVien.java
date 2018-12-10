package com.ateach.pdf2.polymorphism.example2;

class NhanVien {
    int tinhTong(int a, int b){
        return a+b;
    }
    float tinhTong(int a, int b, int c){
        return (float) a+b+c;
    }
    void lamViec() {
        System.out.println("Nhân viên làm việc");
    }
}


class NhanVienBanHang extends NhanVien{
    @Override
    void lamViec() {
        System.out.println("Nhân viên bán hàng làm việc bán hàng");
    }
}

class NhanVienKiThuat extends NhanVien{
    @Override
    void lamViec() {
        System.out.println("Nhân viên kĩ thuật làm việc kĩ thuật");
    }
}

class Manager{
    public static void main(String[] args) {
        NhanVienBanHang nv = new NhanVienBanHang();
        nv.lamViec();
    }
}

