package com.ateach.pdf2.collectionFrameWork.arraylinkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class BaiTap {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        ArrayList<Integer> mergeTwoLinkedList = new ArrayList<Integer>();
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l2.add(4);
        l2.add(5);
//        l2.add(1);
        l2.add(3);
        l2.add(6);
        l2.add(6);

        int b;
        for (Integer i : l1) {
            mergeTwoLinkedList.add(i);
        }
        for (Integer i : l2) {
            mergeTwoLinkedList.add(i);
        }

        for (Integer x : mergeTwoLinkedList) {
            System.out.println(x);
        }
        System.out.println("sort");

        Collections.sort(mergeTwoLinkedList);
        for (Integer x : mergeTwoLinkedList) {
            System.out.println(x);
        }
        System.out.println("delete duplicated");

//        for (int i = 0; i < mergeTwoLinkedList.size(); i++) {
//            for (int j = i + 1; j < mergeTwoLinkedList.size() - 1; j++) {
//                if (mergeTwoLinkedList.get(i) == mergeTwoLinkedList.get(j)) {
//                    mergeTwoLinkedList.remove(j);
//                    System.out.println(mergeTwoLinkedList.get(i));
//                    mergeTwoLinkedList.remove(i);
//                }
//            }
//        }
        for (int i = 1; i < mergeTwoLinkedList.size() - 1; i++) {
            if (mergeTwoLinkedList.get(i) == mergeTwoLinkedList.get(i + 1)) {
                mergeTwoLinkedList.remove(i);
            }
            if (mergeTwoLinkedList.get(i) == mergeTwoLinkedList.get(i - 1)) {
                mergeTwoLinkedList.remove(i);
            }
        }

        for (Integer x : mergeTwoLinkedList) {
            System.out.println(x);
        }
    }
    //public static int[] mergeTwoLinkedList(){}
}
