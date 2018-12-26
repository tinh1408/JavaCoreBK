package com.ateach.pdf2.exercise;

abstract class Quiz3 {

    public void methodNonAbstract() {
        System.out.println("This is method non Abstract");
    }

    abstract void methodAbstract();

}


abstract class Quiz4 {
    final int id = 100;
    static String name;
    String address;

    protected void methodProtected() {

    }

    private void methodPrivate() {

    }

    public void methodPublic() {

    }

}

//class testInheritanceQ3Q4 extends Quiz3,Quiz4 {
class testInheritanceQ3Q4 extends Quiz3 {
    void methodAbstract() {
        System.out.println("this's content");
    }

}