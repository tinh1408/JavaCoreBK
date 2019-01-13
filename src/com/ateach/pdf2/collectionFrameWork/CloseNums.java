package com.ateach.pdf2.collectionFrameWork;

import java.lang.reflect.Array;
import java.util.HashMap;

public class CloseNums {
    static boolean containsCloseNums(int[] nums, int k) {
        int l = 0;
        HashMap hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                l = (int) hm.get(nums[i]);
                if ((Math.abs(l - i) <= k))
                    return true;
            }
            hm.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ars = new int[]{0, 1, 2, 3, 5,2};
        System.out.println(containsCloseNums(ars,2));
    }
}

