package com.ateach.pdf1.basic.array;

public class SapXepMang {
    public static void sapXepThuTuMang() {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
