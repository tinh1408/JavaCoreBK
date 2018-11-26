package com.ateach.pdf2.abstraction.example1;
//Advantages of Abstraction
//
//        It reduces the complexity of viewing the things.
//        Avoids code duplication and increases reusability.
//        Helps to increase security of an application or program as only
//        important details are provided to the user.

public class Abstraction1 {

    public static void main(String[] args) {

        Employee contractor = new Boss("contractor", 10, 10);
        Employee fullTimeEmployee = new Developer("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}