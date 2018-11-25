package com.ateach.pdf2;

class TestThis {
    int a, b;

    public TestThis() {
        a = 300;
    }

    public void accessClassB() {
        TestB obj = new TestB();
        System.out.println("a cua TestB: " + obj.a);
        System.out.println("a cua Test This: " + this.a);
    }
}

class TestB {
    int a = 20;
}

class Test {
    public static void main(String[] args) {
        TestThis ts = new TestThis();
        ts.accessClassB();
    }
}
