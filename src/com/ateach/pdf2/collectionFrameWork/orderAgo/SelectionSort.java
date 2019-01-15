package com.ateach.pdf2.collectionFrameWork.orderAgo;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i]; // Lưu phần tử lớn nhất
            int index = i; // lưu vị trí chứa phần tử lớn nhất
            for (int j = i + 1; j < array.length; j++) {
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            // Nếu chỉ số đã thay đổi, ta sẽ hoán vị
            if(index != i){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }

    }

}
