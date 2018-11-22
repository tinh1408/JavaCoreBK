package com.javabk.han.newpkg;

public class Recusiver1 {
    public static void main(String[] srgs) {
        System.out.println(Sum(3));
    }

    public static float Sum(float n) {
        if (n == 1)
            return 1;
        float tong =(1 / n) + Sum(n - 1);
        return tong;
    }
}
