package com.ateach.pdf2.stopwatch;

class StopWatchTest {

    public static void main(String[] args) {
        int[] arrTest = {9,14,3,2,43,11,58,22,9,0,3,1};
        StopWatch obst = new StopWatch();

        System.out.println(obst.getStartTime()); // lay thoi gian cua he thong HH:MM:SS

        obst.start(); // bat dau do

        System.out.println(obst.getStartTime()); // hien thi thoi gian ban dau test

        selectionSort(arrTest);  // thuc hien chuong trinh sap xep

        obst.end();  // ket thuc do

        obst.getElapsedTime(); // lay hieu thoi gian truoc va sau khi do

        System.out.println(obst.getEndTime()); // in ra thoi gian sau khi do

    }

    // selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}