package com.ateach.pdf2.oop.abstraction.quizz;


abstract class Hinh {
}

abstract class DaGiac extends Hinh {
}

class Tron extends Hinh {
}

class TamGiac extends DaGiac {
}

class ChuNhat extends DaGiac {
}

class Test2 {
    public static void main(String[] args) {
        Hinh h1 = new Tron();
        Hinh h2 = new TamGiac();
        Hinh h3 = new ChuNhat();
        DaGiac h4 = (DaGiac) h2;
        Tron h6 = (Tron) h1;
        h2 = h3;
        Hinh h5 = h1;
    }
}

