package com.ateach.pdf2.oop.inheritance.person;

import java.util.Scanner;

public class ApplicationPerson {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int x;
            System.out.println("How many person ?");
            int ttps = in.nextInt();
            ManagerPerson mn = new ManagerPerson(ttps);

            do {
                System.out.println("\n\t\t----------------------------------");
                System.out.println("\t\t|1. Add new student\t\t\t\t |");
                System.out.println("\t\t|2. Add new staff\t\t\t\t\t |");
                System.out.println("\t\t|3. Display person list\t\t |");
                System.out.println("\t\t--------------------------------------");
                x = in.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Enter total student");
                        int st = in.nextInt();
                        mn.addNewStudent(st);
                        break;
                    case 2:
                        System.out.println("Enter total staff");
                        int sf = in.nextInt();
                        mn.addNewStaff(sf);
                        break;
                    case 3:
                        mn.displayStudentAndStaff();
                        break;
                }
            } while (x != 0);
        }
}
