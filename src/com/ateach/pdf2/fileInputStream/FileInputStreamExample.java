package com.ateach.pdf2.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamExample {
    public static void main(String[] args) {
        File file=new File("file.txt");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            int b;
            while((b=fileInputStream.read())!=-1){
                System.out.print((char)b);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
