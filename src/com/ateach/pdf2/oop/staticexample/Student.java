package com.ateach.pdf2.oop.staticexample;

class Student {
    static String name; // static instance
    int age; // non-static instance

    Student(String nameInput, int ageInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    public static void staticMethod() {
        //  System.out.println(age); // can't access instance age
        System.out.println(name); // access static instance
    }

    public void nonStaticMethod() {
        System.out.println(age); // can't access instance age
        System.out.println(name); // access static instance
    }

    public static void main(String[] args) {
        staticMethod();
        //nonStaticMethod(); // can't access
    }
}

class School {

    public void callStudentClass() {
        Student st = new Student("HSA", 30);
        
        st.staticMethod();
        st.nonStaticMethod();



        Student st1 = new Student("HSB", 25);
        Student st3 = new Student("HSC", 20);
    }
}

