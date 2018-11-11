package com.ateach.testPf1;

public class TestPF1 {
    static void test(){
                int[][] a = {{2, 3, 4}, {5, 6, 7}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    System.out.print(a[i][j]);
                }
            }
        }

//                int sum = 1, i = 5;
//                while(i < 7){
//                    sum += i;
//                    i++;
//                }
//                System.out.println(sum);
//        //Task #1
//        int a= 5;
//        int b = a++;
//        int c = ++b;
//        int d = c--;
//        System.out.println(a+""+b+""+""+c+""+""+d);
    }
    public static void inRa() {
        int x = -1, a[] = {1, 2, 3, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                x = a[i];
            }
        }
        System.out.println(x);
    }
}
