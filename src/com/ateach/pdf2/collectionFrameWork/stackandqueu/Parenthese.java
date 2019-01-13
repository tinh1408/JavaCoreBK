package com.ateach.pdf2.collectionFrameWork.stackandqueu;

import java.util.Stack;

class Parentheses {
    private static final char L_PAREN = '(';
    private static final char R_PAREN = ')';
    private static final char L_BRACE = '{';
    private static final char R_BRACE = '}';
    private static final char L_BRACKET = '[';
    private static final char R_BRACKET = ']';

    //mystack = {(
//    String st1 = "[()]{()}{}";

    public static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == L_PAREN)
                stack.push(L_PAREN);
            else if (s.charAt(i) == L_BRACE)
                stack.push(L_BRACE);
            else if (s.charAt(i) == L_BRACKET)
                stack.push(L_BRACKET);
            else if (s.charAt(i) == R_PAREN) {
                if (stack.pop() != L_PAREN)
                    return false;
            } else if (s.charAt(i) == R_BRACE) {
                if (stack.pop() != L_BRACE)
                    return false;
            } else if (s.charAt(i) == R_BRACKET) {
                if (stack.pop() != L_BRACKET)
                    return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String st1 = "[()]{()}{}";
        String st2 = "({})[]";
        String st3 = "(){}";

        System.out.println(checkParen(st3));
    }

}

