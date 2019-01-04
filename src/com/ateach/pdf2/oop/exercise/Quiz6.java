package com.ateach.pdf2.oop.exercise;

//a....
abstract class AbClss{
    abstract void method1();
    abstract void method2();
}

//public class Quiz6 extends AbClss{
//
//}

//b...
abstract class AbChild extends AbClss{
    @Override
    void method2() {
        System.out.println("Contents of method2");
    }
}

