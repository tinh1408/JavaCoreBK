package com.ateach.pdf2.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {
    public static void main(String[] args) {

        File inFile = new File("input.txt");
        File outFile = new File("output.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(inFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
