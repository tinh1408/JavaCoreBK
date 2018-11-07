package com;

import java.util.Scanner;

public class VillaManager {
    static int[][] villa = null;

    public static void addNewVilla(int totalVilla) {
        villa = new int[totalVilla][2];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < villa.length; i++) {
            System.out.println("Enter total bed & total swimming pool of villa " + (i + 1));
            for (int j = 0; j < villa[i].length; j++) {
                villa[i][j] = scn.nextInt();
            }
        }
    }

    public static void displayVillaInfo() {
        System.out.println("villa ----------Bed----Swimming pool");
        for (int i = 0; i < villa.length; i++) {
            System.out.print("Villa " + (i + 1) + "\t\t\t");
            for (int j = 0; j < villa[i].length; j++) {
                System.out.print(villa[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
}
