package com.ateach.pdf1.basic.array;

public class ContructArray {
    int[] constructArray(int size) {
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 7;
        for(int i = 2; i< size-1;i++){
            arr[i] = i ;
            arr[i+1] = (size) -1;

        }
        return arr;
    }
}
