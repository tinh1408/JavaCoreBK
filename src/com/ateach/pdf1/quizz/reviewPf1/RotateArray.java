package com.ateach.pdf1.quizz.reviewPf1;

public class RotateArray {

    int[][] rotateImage(int[][] a) {
        int[][] rotate = new int[a.length][a.length];
        int index = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a.length; j++) {
                rotate[j][index] = a[i][j];
            }
            index++;
        }
        return rotate;
    }
}
