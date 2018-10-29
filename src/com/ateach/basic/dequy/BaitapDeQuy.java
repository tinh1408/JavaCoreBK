package com.ateach.basic.dequy;

public class BaitapDeQuy {
    public  static int tong(int a){
        if (a<=0){
            return 0;
        }

        return a + tong(a-1);
    }
}
