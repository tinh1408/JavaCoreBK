package com.ateach.pdf2.collectionFrameWork.orderAgo;

public class OrderTree {
    int[] sortByHeight(int[] a) {
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] != -1){
                int smallest = i;
                for(int j = i + 1; j < a.length; j++){
                    if(a[j] != -1){
                        if(a[smallest] > a[j]){
                            smallest = j;
                        }
                    }
                }
                int temp = a[smallest];
                a[smallest] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }
}
