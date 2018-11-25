package com.ateach.pdf2;

public class StaticSample {
    public static int count = 0;
    public int a = 0;

    public StaticSample() {
        count++;
        a++;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        StaticSample aClass = new StaticSample();
        StaticSample bClass = new StaticSample();
        // Đếm số đối tượng đã được tạo (biến static ko bị gán lại)
        System.out.println(StaticSample.count);
        // Các Biến non static bị gán lại ứng với mỗi đối tượng
        System.out.println(aClass.getA());
        System.out.println(bClass.getA());
    }

}
