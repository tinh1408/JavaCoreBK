package com.javabk.han;

public class SuitableRoom {
    public static void main(String[] args) {
        System.out.println(suitableRoom());

    }

    public static int suitableRoom() {
        int[][] args = new int[][]{{1, 1, 1, 0},
                                   {0, 5, 0, 5},
                                   {2, 1, 3, 10}};
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (args[i][j] == 0) {
                    if ((i + 1) > args.length - 1){
                        continue;
                    } else{
                        args[i + 1][j] = 0;
                    }
                }
                sum += args[i][j];
            }
        }
        return sum;
    }
}
