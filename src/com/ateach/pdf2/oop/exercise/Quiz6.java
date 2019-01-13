package com.ateach.pdf2.oop.exercise;

//a....
abstract  class AbClss1{
    abstract void method1();
    abstract void method2();
}
abstract  class AbClss2 extends AbClss1{
    abstract void method3();
    abstract void method4();
}

//public class Quiz6 extends AbClss{
//
//}

//b...
 class AbChild extends AbClss2{
    void method1() {
        System.out.println("Contents of method2");
    }
    void method2() {
        System.out.println("Contents of method2");
    }

    void method3() {
        System.out.println("Contents of method2");
    }
    void method4() {
        System.out.println("Contents of method2");
    }

}

