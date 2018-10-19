package com.ateach.array;

/*    Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
        each statue having an non-negative integer size.
        Since he likes to make things perfect, he wants to arrange them from smallest to
        largest so that each statue will be bigger than the previous one exactly by
        1. He may need some additional statues to be able to accomplish that.
        Help him figure out the minimum number of additional statues needed.

        Example

        For statues = [6, 2, 3, 8], the output should be
        makeArrayConsecutive2(statues) = 3.

        Ratiorg needs statues of sizes 4, 5 and 7.*/


public class MakeArrayCosecutive {
    public static void makeArrayConsecutive2() {
        int[] args = new int[]{6, 2, 3, 8};
        // sap xep
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i] > args[i + 1]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] + 1 != args[i + 1]) {
                sum = sum + args[i + 1] - args[i] - 1;
            }
        }

        System.out.println("-----");
        for (int k = 0; k < args.length; k++) {
            System.out.println(args[k]);
        }
    }


}
