package com.ateach.pdf2.inheritance.person;

import com.dtv.nganhang.ListGD;

import java.util.Scanner;

public class ManagerPerson {
    private int total;
    private int count;
    Person[] ps = null;
    public ManagerPerson(int totals){
        ps = new Person[totals];
    }

    public void addNewStudent(int sl){
        for(int i = 0; i<sl;i++){
            Student st = new Student();
            st.addInfoStudent();
            ps[count] = st;
            count ++;
        }
    }
    public  void addNewStaff(int sl){
        for(int i = 0; i <sl ; i++){
            Staff sf = new Staff();
            sf.addInfoStaff();
            ps[count] = sf;
            count ++;
        }
    }

    public void displayStudentAndStaff(){
        for(int i = 0; i< count; i++){
            System.out.println("Person: "+(int)(i +1)+": "+ps[i].toString());
        }
    }
}


