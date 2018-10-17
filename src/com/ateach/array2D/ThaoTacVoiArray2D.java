package com.ateach.array2D;

import java.util.Scanner;

public class ThaoTacVoiArray2D {
    public static void array2D(){
        // gan truc tiep
        int[][] rating = new int [][]{{8,9,7,10},{8,7,7,10},{9,5,7,10}};
        // gan gian tiep
        Scanner scn = new Scanner(System.in);
        int[][] assignValue = new int[3][4];
        for (int i=0; i<assignValue.length;i++){
            for(int j=0;j<assignValue[i].length;j++){
                System.out.println("Gia tri dong: "+i+" cot:"+j);
                assignValue[i][j] = scn.nextInt();
            }
        }
        System.out.println("mang in ra: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(assignValue[i][j]+ " ");
            }
            System.out.println();
        }
        //

    }
}
