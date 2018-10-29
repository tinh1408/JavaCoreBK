package com.han.newpkg;

public class LateRide {
    public static void main(String[] args){
        System.out.println(lateRide(240));
    }
    public static int lateRide(int n){
        int gio,phut,tong,h1,h2,p1,p2;
        gio=(n/60);
        phut=(n%60);
        h1=gio/10;
        h2=gio%10;
        p1=phut/10;
        p2=phut%10;
        tong=h1+h2+p1+p2;
        return tong;
    }
}
