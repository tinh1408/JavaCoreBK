package com.ateach.pdf2.searchAgo;

import java.util.Arrays;

public class LinerAndBinarySearch {
    static int linearSearch(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    static int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) return mid;
            if (arr[mid] > value) return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }

    public boolean binarySearch(int[] data, int key) {

        int low = 0;
        int high = data.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] source = {6, 32, 11, 22, 89, 45, 10, 1, 7, 55, 0, 8, 100, 94, 23, 53};

        //-----------------------------------------
        long startTime = System.nanoTime();
        System.out.println(linearSearch(source, 22));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("linear search:  " + duration);
        //-----------------------------------------

        Arrays.sort(source);
        System.out.println(Arrays.toString(source));

        //-----------------------------------------
        long startTimeBina = System.nanoTime();
        System.out.println(binarySearch(source, 0, source.length, 22));
        long endTimeBina = System.nanoTime();
        long durationBina = endTimeBina - startTimeBina;
        System.out.println("Binary search:  " + durationBina);
        //-----------------------------------------

    }
}
