package com.ateach.pdf2.overriding;

class Xe {
    void diChuyen(){
        System.out.println("Xe di chuyển");
    }
}

class XeDap extends Xe{
    @Override
    void diChuyen() {
        System.out.println("Di chuyển nhờ bánh xích");
    }
}
class XeMay extends Xe{
    @Override
    void diChuyen() {
        System.out.println("Di chuyển nhờ động cơ");
    }
}
class Manager{
    public static void main(String[] args) {
        XeDap xd = new XeDap();
        Xe x = new XeDap();
        x.diChuyen();
        xd.diChuyen();
    }
}

