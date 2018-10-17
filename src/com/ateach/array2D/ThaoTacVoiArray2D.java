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
        int sum= 0;
        for(int j=0; j<assignValue.length; j++){
            sum = sum + assignValue[j][3];
        }
        System.out.println("gia tri:"+sum);
        double trungBinh = sum/3;
        System.out.println(trungBinh);

        //
    }

    public static void bangTuanHoan(){
        int [][] tuanHoan = new int[][]{{3,5,7,9},{4,2},{5,7,8,6},{6}};
        inMang(tuanHoan);
    }

    public static void inMang(int arrs[][]){
        System.out.println("mang in ra: ");
        for (int i=0; i<arrs.length; i++){
            for(int j=0; j<arrs[i].length; j++){
                System.out.print(arrs[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void duongCheoThuNhat(){
        int[][] arrgs = new int[][]{{1,2,4},{5,6,8},{9,6,3}};
        int sum = 0;
        for(int i = 0; i<arrgs.length;i++){
            for(int j=0; j<arrgs[i].length; j++){
                if(i==j){
                    sum =sum+arrgs[i][j];
                }
            }
        }
        System.out.println("tong duong cheo: "+sum);
        inMang(arrgs);
    }

    public static void duongCheoThuHai(){
        int[][] arr2d = new int[][]{{1,2,4},{5,6,8},{9,6,3}};
        int sum1 =0;

        for(int k = 0; k<arr2d.length; k++){
            for(int q  = arr2d[k].length-1; q>0;q--){
                sum1 = sum1+ arr2d[k][q];
            }
        }
        inMang(arr2d);
        System.out.println(sum1);
    }

    public static void congHaiMaTran (){
        int [][] maTran1 = new int[][]{{2,3,4},{1,1,1},{6,5,2}};
        int [][] maTran2 = new int[][]{{1,6,7},{3,4,6},{2,3,2}};
        int [][] maTran3 = new int[3][3];
        for(int i = 0; i<maTran1.length; i++){
            for(int j = 0; j<maTran1[i].length; j++){
                maTran3[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }
        inMang(maTran3);
    }
}
