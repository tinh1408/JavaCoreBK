package com.ateach.pdf1.quizz.reviewPf1;

public class shiftalphabet {
    String alphabeticShift(String inputString) {
        char[] ss = inputString.toCharArray();
        for (int i = 0; i < ss.length; ++i) {
            System.out.println(ss[i]);
//            ss[i]++;
//            if (ss[i] > 'z')
//                ss[i] = 'a';
        }
        return new String(ss);
    }
}
