package com.ateach.pdf2.oop.staticexample.example1;

public class ExampleStatic {
    int schoolId = 111;
    static String schoolName = "Oxford";

    void schoolInfo(){
        System.out.println("id" + schoolId + "name "+ schoolName);
    }
}

class Manager {
    public static void main(String[] args) {
        System.out.println(ExampleStatic.schoolName);

        ExampleStatic ex = new ExampleStatic();
        ex.schoolInfo();
        System.out.println(ex.schoolId);
//        System.out.println(ex.);
    }
}
