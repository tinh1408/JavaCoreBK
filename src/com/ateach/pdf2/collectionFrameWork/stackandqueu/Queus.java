package com.ateach.pdf2.collectionFrameWork.stackandqueu;

import java.util.LinkedList;
import java.util.Queue;

public class Queus {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        for (Integer i : q) {
            System.out.println(i);
        }

        System.out.println("peek method: " + q.peek()); //Lấy phần tử ở đầu tiên hàng đợi nhưng không xóa
        System.out.println("poll method: " + q.poll());//Lấy phần từ đầu tiên của hàng đợi và xóa nó ra khỏi hàng đợi
        for (Integer i : q) {
            System.out.println(i);
        }
//        System.out.println();

    }
}
