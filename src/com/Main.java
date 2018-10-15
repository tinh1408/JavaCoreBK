package com;

import com.ateach.array.Duplicate;
import com.ateach.array.MakeArrayCosecutive;
import com.ateach.array.SapXepMang;
import com.ateach.array.ThaoTacVoiMang;
import com.ateach.dieukien.DocSo;
import com.khai.XoaPhanTuTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * This class shows different methods for copy array in java
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,6,0};
        String newString = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        for(int i =0; i<newString.length();i++){
            System.out.println(newString);
        }
    }

//    public static void chenPhanTuVaoGiua(){
//        String[] tauThongNhat = new String[]{"toa1","toa2","toa3","toa4"};
//        // chen toaA vao giua toa 2 va toa 3
//        // toa1,toa2,toaA,toa3,toa4
//        int doDai = tauThongNhat.length+1;
//        String[] thn = new String[doDai];
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Nhap vi tri muon chen: ");
//        int viTri = scn.nextInt(); //2
//
//        for(int i = 0;i < viTri; i++){
//            thn[i]=tauThongNhat[i];
//        }
//        thn[viTri]="toaA";
//        for(int j= viTri;j<tauThongNhat.length;j++){
//            thn[j+1]=tauThongNhat[j];
//        }
//        System.out.println(Arrays.toString(thn));
//        System.out.println("----------------------------------------");
//        String[] doanTauNew = new String[thn.length-1];
//        doanTauNew = Arrays.copyOfRange(thn,0,2); //toa1,toa2,toaA,toa3,toa4
//        doanTauNew = Arrays.copyOfRange(thn,3,thn.length);
//        System.out.println(Arrays.toString(doanTauNew));
//        Arrays.binarySearch()

        //toa1,toa2,toa3,toa3,toa4 ->


//    }

}