package com.ateach.pdf2.collectionFrameWork;

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}

public class ListPalindrome {
    boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> pointer = l;

        if (pointer == null) return true;
        // create list in reverse order
        ListNode<Integer> prev = new ListNode(pointer.value);
        while (pointer.next != null) {
            pointer = pointer.next;
            ListNode<Integer> cur = new ListNode(pointer.value);
            cur.next = prev;
            prev = cur;
        }

        pointer = l;
        while (pointer != null) {
            if (!pointer.value.equals(prev.value))
                return false;
            pointer = pointer.next;
            prev = prev.next;
        }
        return true;
    }
}

class Test {
    public static void main(String[] args) {
//        ListNode<Integer> l = new ListNode<>;
//
//        ListPalindrome lpd = new ListPalindrome();
//
//        lpd.isListPalindrome();
    }
}
