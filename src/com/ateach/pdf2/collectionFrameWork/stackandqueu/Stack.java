package com.ateach.pdf2.collectionFrameWork.stackandqueu;

import java.util.ArrayList;
import java.util.Stack;

class StackCls {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();

        st.push(1);
        st.push(2);
        st.push(3);

        for (Integer i : st) {
            System.out.println(i);
        }

//        System.out.println(st.toArray().toString());
        System.out.println("pop method: " + st.pop()); // Trả về phần tử đầu tiên của Stack, Và xóa nó ra khỏi stack
        System.out.println("peek method: " + st.peek()); //Trả về phần tử đầu tiên của Stack, nhưng không xóa nó ra khỏi stack
//        System.out.println("serarh"+st.search(1));
//
        for (Integer i : st) {
            System.out.println(i);
        }
    }
}
