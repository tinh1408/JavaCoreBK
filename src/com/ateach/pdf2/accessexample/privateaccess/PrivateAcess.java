package com.ateach.pdf2.accessexample.privateaccess;

 class PrivateAcess {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
}

 class Simple {
    public static void main(String args[]) {
        PrivateAcess obj = new PrivateAcess();

        //   System.out.println(obj.data); // can't access to field private
        //   obj.msg(); //// can't access to method private

        // we will access private method and field through geter and setter;
    }
}