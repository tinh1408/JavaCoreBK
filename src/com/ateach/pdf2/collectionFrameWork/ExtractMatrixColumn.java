package com.ateach.pdf2.collectionFrameWork;

import java.util.ArrayList;

public class ExtractMatrixColumn {
    //using array
    static int[] extractMatrixColumn(int[][] matrix, int column) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][column];
        }
        return result;
    }
    //using ArrayList

    static ArrayList<Integer> extractMatrixArray(int[][] matrix, int column) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            ar.add(matrix[i][column]);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{8, 9, 7, 10}, {8, 7, 7, 10}, {9, 5, 7, 10}};
        System.out.println(extractMatrixArray(matrix,3).toString());
//        System.out.println(Arrays.toString(extractMatrixColumn(matrix, 3)));

    }
}
