package com.javabk.han.newpkg;

public class PhoneCall {
    public static void main(String[] args){
        System.out.println(phoneCall(3,1,2,20));
    }
    public static int phoneCall(int min1,int min2_10,int min11,int s){
        int max=0,t1,t2,t3;
            if(s<min1) System.out.println("thue bao quy khach khong du tien su dung!!!");
            else{
                t1=1;
                s-=min1;
                if(s>=9*min2_10){
                    t2=9;
                    s-=9*min2_10;
                }else{
                    t2=s/min2_10;
                    s-=t2*min2_10;
                }
                t3=s/min11;
                max=t1+t2+t3;
            }
        return max;
    }

}
