package com.ateach.pdf2.oop.accessexample.defaultaccess.defaultpackage1;

public class DefaultClassPackge1 {
    int data = 10; // default modifier field (default access modifier field)

    void msg() { // default modifier method (default access modifier method)
        System.out.println("Hello");
    }
}


// access default modifier because DefaultInPackage in same package
// with DefaultClassPackge1 have default modifier field and method default modifier
class DefaultInPackage {
    public static void main(String args[]) {
        DefaultClassPackge1 obj = new DefaultClassPackge1();
        System.out.println(obj.data);
        obj.msg();
    }
}



