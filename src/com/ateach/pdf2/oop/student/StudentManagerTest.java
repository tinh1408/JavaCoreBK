package com.ateach.pdf2.oop.student;

public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student andy = new Student("Andy", 23);
        studentManager.add(andy);
        System.out.println("added " + andy.getInfomation());
        studentManager.displayAll();
        studentManager.find("Andy");
    }

}
