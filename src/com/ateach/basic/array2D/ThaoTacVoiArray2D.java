package com.ateach.basic.array2D;

import java.util.Scanner;

public class ThaoTacVoiArray2D {
    public static void array2D(){
        // gan truc tiep
        int[][] rating = new int [][]{{8,9,7,10},{8,7,7,10},{9,5,7,10}};
        Scanner scn = new Scanner(System.in);
        // gan gian tiep
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
        // cach 1
        for(int i = 0; i<arrgs.length;i++){
            for(int j=0; j<arrgs[i].length; j++){
                if(i==j){
                    sum =sum+arrgs[i][j];
                }
            }
        }

        //cach 2
//        for(int i = 0; i<arrgs.length;i++){
//            sum = sum + arrgs[i][i];
//        }
        System.out.println("tong duong cheo 1: "+sum);
    }

    public static void duongCheoThuHai(){
        int[][] arr2d = new int[][]{{1,2,4},{5,6,8},{9,6,3}};
        int sum1 = 0;
        for(int k = 0; k < arr2d.length; k++){
            sum1 = sum1 + arr2d[k][arr2d.length-k-1]; // vi du k = 0 thi hang 0 cot 3(arr2d.length = 3)-0(k=0)-1  ->arr[0][2] + arr[1][1]+ arr[2][0]
        }
        System.out.println("Tong duong cheo 2: "+sum1);
    }

    // cach 2 tinh tong 2 duong cheo

    public static void tongHaiDuongCheo(){
        int[][] arr2d = new int[][]{{1,2,4},{5,6,8},{9,6,3}};
        int sum = 0;
        for (int i = 0; i<arr2d.length; i++){
            sum = sum + arr2d[i][i]+arr2d[i][arr2d.length-i-1];
        }
        System.out.println(" tong hai duong cheo: "+sum);
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
