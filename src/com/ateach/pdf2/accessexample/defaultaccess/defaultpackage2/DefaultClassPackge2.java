package com.ateach.pdf2.accessexample.defaultaccess.defaultpackage2;

import com.ateach.pdf2.accessexample.defaultaccess.defaultpackage1.*;

public class DefaultClassPackge2 {

    // can't access default modifier because DefaultInPackage in other package
// with DefaultClassPackge2
    public static void main(String args[]) {
        DefaultClassPackge1 obj = new DefaultClassPackge1();


    }
}
