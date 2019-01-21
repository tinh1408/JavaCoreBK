package com.ateach.pdf2.fileInputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {
    public static void main(String[] args) {
        String data = "This is an example of writing data to a file.";
        File file = new File("outfile.txt");
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
