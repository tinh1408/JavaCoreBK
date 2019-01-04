package com.ateach.pdf2.oop.exercise;

interface Quiz5a {
    int id = 100; //must initialed
    //protected String name;
    //private String name;
    public String name = "name";
}


interface Quiz5b{
    String address ="DN";
}


class TestQuiz5{
    public static void main(String[] args) {
        System.out.println(Quiz5a.id);
    }
}

//c.
class implementTwoInterface implements Quiz5a,Quiz5b{
    public static void main(String[] args) {
        System.out.println("id: "+Quiz5a.id + "address: "+Quiz5b.address);
    }
}
// d.

abstract class AbsClass implements Quiz5b{
    abstract void show();
}

//interface IntClass implement AbsClass  {
//
//}


