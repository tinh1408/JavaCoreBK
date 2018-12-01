package com.ateach.pdf2.packageexample.package2;

import com.ateach.pdf2.packageexample.package1.*; // path access to package 1

public class ClassOfPackage2 {

    public static void main(String[] args) {
        ClassOfPackage1 objPk1 = new ClassOfPackage1();
        System.out.println(objPk1.variablePackage1);
        objPk1.info();
    }
}
