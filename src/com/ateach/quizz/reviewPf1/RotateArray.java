package com.ateach.quizz.reviewPf1;

public class RotateArray {
    public static int[][] rotate(int[][] a){
            final int n = a.length;

            // mirror horizontally
            for (int i = 0; i < n / 2; i++)
            {
                int[] swap = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = swap;
            }

            // mirror diagonally
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - i; j++)
                {
                    int swap = a[i][i + j];
                    a[i][i + j] = a[i + j][i];
                    a[i + j][i] = swap;
                }
            }

            return a;
        }

}
