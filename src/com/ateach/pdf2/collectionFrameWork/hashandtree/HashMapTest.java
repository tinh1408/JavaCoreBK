package com.ateach.pdf2.collectionFrameWork.hashandtree;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    static void insertAndPrint(HashMap<Integer, String> map)
    {
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        HashMap<String,String> map1 = new HashMap<String,String>();

        map1.put("a","Anchor");
        map1.put("b","Anchor");
        map1.put(null,"value null");
//        map1.put("b","value null");
        for (Map.Entry x: map1.entrySet()){
            System.out.println("key:   " +x.getKey()+"   value:  "+x.getValue());

        }
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        insertAndPrint(map);
    }
}
