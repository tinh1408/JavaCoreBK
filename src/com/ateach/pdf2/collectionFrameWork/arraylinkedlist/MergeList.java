package com.ateach.pdf2.collectionFrameWork.arraylinkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class MergeList {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        ArrayList<Integer> lnew = new ArrayList<Integer>();
        lnew.addAll(l1);
        lnew.addAll(l2);
        System.out.println(lnew.toString());
        Stack<Integer> stack = new Stack<Integer>();

    }
}

