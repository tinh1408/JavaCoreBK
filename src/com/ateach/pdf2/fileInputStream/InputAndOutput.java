package com.ateach.pdf2.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {

        File inFile = new File("E:\\testfile\\file.mp3");
        File outFile = new File("E:\\testfile\\out.mp3");

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
        readContentFromFile();
    }

    public static void readContentFromFile() {
        String pathName = "E:\\testfile\\out.mp3";
        File fl = new File(pathName);
        try {
            Scanner sc = new Scanner(fl);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
