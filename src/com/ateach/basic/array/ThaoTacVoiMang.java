package com.ateach.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacVoiMang {

    public static void themPhanTuVaoCuoi() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length + 1;

        String[] arrNewStr = new String[newSize];
        for (int i = 0; i < arrStr.length; i++) {
            arrNewStr[i] = arrStr[i];
        }
        arrNewStr[newSize - 1] = "LastItem";
        for (int k = 0; k < arrNewStr.length; k++) {
            System.out.println(arrNewStr[k]);
        }
    }

    public static void themPhanTuVaoDau() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length + 1;
        String[] arrNewStr = new String[newSize];
        arrNewStr[0] = "FistItem";
        for (int i = 0; i < arrStr.length; i++) {
            arrNewStr[i + 1] = arrStr[i];
        }

    }

    public static void themPhanTuVaoGiua() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length + 1;
        String[] arrNewStr = new String[newSize];

        //B2. Nhap vi tri va gia tri
        Scanner scn = new Scanner(System.in);
        System.out.println("Vi tri: ");
        int viTri = scn.nextInt();
        System.out.println("Gia tri:");
        String giaTri = scn.next();

        for (int i = 0; i < viTri; i++) {
            arrNewStr[i] = arrStr[i];
        }
        arrNewStr[viTri] = giaTri;
        for (int j = viTri; j < arrStr.length; j++) {
            arrNewStr[j + 1] = arrStr[j];
        }
        //B4. In ra
        for (int j = 0; j < arrNewStr.length; j++) {
            System.out.println(arrNewStr[j]);
        }
    }


    public static void xoaPhanTuDauTien() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length - 1;
        String[] arrNewStr = new String[newSize];
        for (int i = 1; i < arrStr.length; i++) {
            arrNewStr[i - 1] = arrStr[i];
        }
        for (int k = 0; k < arrNewStr.length; k++) {
            System.out.println(arrNewStr[k]);
        }
    }

    public static void xoaPhanTuCuoiCung() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length - 1;
        String[] arrNewStr = new String[newSize];
        for (int i = 0; i < arrStr.length - 1; i++) {
            arrNewStr[i] = arrStr[i];
        }
        for (int k = 0; k < arrNewStr.length; k++) {
            System.out.println(arrNewStr[k]);
        }
    }

    public static void xoaPhanTuGiua() {
        String[] arrStr = new String[]{"item1", "item2", "item3"};
        int newSize = arrStr.length - 1;
        String[] arrNewStr = new String[newSize];
        Scanner scn = new Scanner(System.in);
        System.out.println("Vi tri xoa: ");
        int viTri = scn.nextInt();
        System.out.println(arrStr[viTri]);

        for (int j = viTri; j < arrStr.length - 1; j++) {
            arrStr[viTri] = arrStr[j + 1];
            break;
        }
        if (viTri == 0) {
            arrNewStr = Arrays.copyOfRange(arrStr, 1, arrStr.length);
        } else if (viTri == arrStr.length) {
            arrNewStr = Arrays.copyOfRange(arrStr, 0, arrStr.length - 1);
        } else {
            arrNewStr = Arrays.copyOfRange(arrStr, 0, arrStr.length - 1);
        }
        System.out.println(Arrays.toString(arrNewStr));

    }

    public static void usingArrays() {
        int args[] = new int[]{2, 3, 9, 0};
        int destination[] = null;
        destination = Arrays.copyOf(args, args.length);
        System.out.println(Arrays.toString(destination));
        destination = Arrays.copyOfRange(args, args.length - 2, args.length);
        System.out.println(Arrays.toString(destination));
        int result = Arrays.binarySearch(args, 3);
        System.out.println(result);
    }
}
