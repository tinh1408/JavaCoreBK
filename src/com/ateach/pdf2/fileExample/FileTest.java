package com.ateach.pdf2.fileExample;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileTest {

    void accessFile() {
        File absoluteFileDisk = new File("E:\\testfile\\file.txt");
        File infolder = new File("src/com/ateach/pdf2/fileExample/file.txt");
        System.out.println("full path: " + absoluteFileDisk.exists());
    }

    public static void writeContentToFile() {
        String pathName = "E:\\testfile\\file.txt";
        try {
            FileWriter wf = new FileWriter(pathName);
            wf.write("tinhph\n");
            wf.write("xin chao");
            wf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readContentFromFile() {
        String pathName = "E:\\testfile\\file.txt";
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

    public static void main(String[] args) {
        writeContentToFile();
        readContentFromFile();
    }
}
