package com.ateach.pdf2;

public class SuperExample {
    int x, y;

    SuperExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x+"--"+y);
    }
}

class MyPoint2 extends SuperExample {
    int z;
    String name;

    MyPoint2(int x, int y, int z, String name) {
        super(x, y); // Khởi tạo 2 biến x, y bằng cách gọi super
        this.z = z; // hàm dựng của lớp cha
        this.name = name;
    }

    void display() { // Viết chồng hàm kế thừa từ lớp cha
        super.display();
        System.out.println(x+""+y+""+z);
    }

    public static void main(String[] args) {
        MyPoint2 obj = new MyPoint2(1,2,5,"tinh");
        obj.display();
    }
}

