package com.ateach.pdf2.collectionFrameWork.hashandtree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    static void insertAndPrint(TreeMap<Integer, String> map) {
        int[] array = {1, -1, 0, 2, -2};
        for (int x : array) {
            map.put(x, Integer.toString(x));
        }
        for (int k : map.keySet()) {
            System.out.print(k + ", ");
        }
    }

    // Driver method to test above method
    public static void main(String[] args) {
//        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//        insertAndPrint(map);

        TreeMap<Integer, Integer> hv = new TreeMap<Integer, Integer>();
        hv.put(1, 7);
        hv.put(5, 9);
        hv.put(4, 3);
        for (Map.Entry v : hv.entrySet()) {
            System.out.println("value: " + v.getValue()+ "key  "+v.getKey());

        }
    }
}
