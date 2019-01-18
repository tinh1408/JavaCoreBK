package com.ateach.pdf2.fileExample;

import java.io.File;
import java.util.*;

public class FinePercentVowel {
    public static void readContentFromFile(int n) {
        String pathName = "E:\\testfile\\vowel.txt";
        File fl = new File(pathName);
        ArrayList<String> sr = new ArrayList<>();
        try {
            Scanner sc = new Scanner(fl);
            while (sc.hasNextLine()) {
                sr.add(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] st = new String[sr.size()];
        for (int i = 0; i < sr.size(); i++) {
            st[i] = sr.get(i);
        }
        for (int j = 0; j < st.length; j++) {
            System.out.println("Line " + (j + 1));
            fineVowel(st[j], n);
            System.out.println();

        }
    }

    public static void fineVowel(String st, int n) {
        String[] stn = new String[st.length() - n];
        for (int i = 0; i < st.length() - n; i++) {
            System.out.println(st);
            stn[i] = st.charAt(i) + "" + st.charAt(i + 1) + "" + st.charAt(i + 2);

            int total = 0;
            for (int j = 0; j < stn[i].length() - 1; j++) {
                if (stn[i].charAt(j) == 'a' || stn[i].charAt(j) == 'e' || stn[i].charAt(j) == 'i' || stn[i].charAt(j) == 'o' || stn[i].charAt(j) == 'u' || stn[i].charAt(j) == 'y') {
                    total = total + 1;
                }
            }
            System.out.println(stn[i] + " (freq = " + total + "/3 = " + (float) total / 3 * 100 + ")");
        }
    }

    public static void main(String[] args) {
        readContentFromFile(3);
    }
}
