package com.ateach.pdf2.inheritance.person;

import java.util.Scanner;

public class Student extends Person{
   private String program;
   private int year;
   private double fee;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student(){
        super();
        program = "";
        year = 0;
        fee = 0.0;

    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void addInfoStudent(){
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter program: ");
        program = sc.next();
        System.out.println("Enter year(int): ");
        year = sc.nextInt();
        System.out.println("Enter fee (double): ");
        fee = sc.nextDouble();
    }
    public String toString(){
        return "Student info: "+super.toString()+", program: "+program+ ", year: "+year + ", fee: "+fee +"";
    }
}
