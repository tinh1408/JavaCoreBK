package com.liem;

import java.util.Random;
import java.util.Scanner;

public class LenhDieuKien {
    public static void cauLenhDieuKien(){
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int Count,Count2,SoTron ;
        double Sprtt = Math.sqrt(100);
        SoTron = (int)(Sprtt);
        boolean IS;
        int[] SoNguyenTo;
        int CountArray = 0;
        for (Count=2;Count<=100;Count++) {
            //System.out.println("");
            IS = true;
            Sprtt = Math.sqrt(Count);
            SoTron = (int) (Sprtt);
            for (Count2 = 2; Count2 < Count; Count2++) {
                if (Count % Count2 == 0) {
                    IS = false;
                    break;
                }
            }
            if (IS == true) {
                System.out.println("Số " + Count + " là số nguyên tố");
            }
        }
    }

    public static void xoSo(){
        Scanner sc = new Scanner(System.in);
        int So_nhap_vao;
        do {
            System.out.print("Vui lòng nhập số có 2 chữ số : ");
            So_nhap_vao = sc.nextByte();
        } while ((So_nhap_vao<0)||(So_nhap_vao>100));
        Random rd = new Random();
        int na = 100;
        int rds = rd.nextInt(na);
        System.out.println("Số Random là : " + rds);
        int So_nhap_vao_thu_nhat_la = So_nhap_vao / 10;
        int So_nhap_vao_thu_hai_la = So_nhap_vao % 10;
        int So_rds_thu_nhat_la = rds / 10;
        int So_rds_thu_hai_la = rds % 10;
        if ((So_nhap_vao_thu_nhat_la == So_rds_thu_nhat_la) && (So_nhap_vao_thu_hai_la == So_rds_thu_hai_la)){
            System.out.println("Phần thưởng của bạn là 10 000$");
        }
        else if ((So_nhap_vao_thu_nhat_la == So_rds_thu_hai_la) && (So_rds_thu_nhat_la == So_nhap_vao_thu_hai_la)){
            System.out.println("Phần thưởng của bạn là 3000$");
        }
        else if ((So_nhap_vao_thu_nhat_la == So_rds_thu_nhat_la) || (So_nhap_vao_thu_hai_la == So_rds_thu_hai_la)||
                (So_nhap_vao_thu_nhat_la == So_rds_thu_hai_la) || (So_rds_thu_nhat_la == So_nhap_vao_thu_hai_la)){
            System.out.println("Phần thưởng của bạn là 1000$");
        }
        else {
            System.out.println("Phần thưởng của bạn là 0$. Chúc mừng bạn");
        }
    }
    public static void giaiPhuongTrinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập lần lượt 3 hệ số a, b, c");
        System.out.print("Vui lòng nhập số  A : ");
        float a = sc.nextFloat();
        System.out.print("Vui lòng nhập số  B : ");
        float b = sc.nextFloat();
        System.out.print("Vui lòng nhập số  C : ");
        float c = sc.nextFloat();
        float  Nghiem1;
        if(a == 0){
            if(b == 0 &&(c!=0)){
                System.out.println("Phương trình vô nghiệm");
            }
            else if((b!=0)&&(c!=0) ){
                Nghiem1 = -b/c;
                System.out.print("Phương Trình Có 1 nghiệm là : " + Nghiem1);
            }
            else if(( b == 0 )&&(c==0) ){
                System.out.println("Phương trình có vô số nghiệm");
            }
        }
        else {
            float Delta= b*b - 4*a*c;
            if (Delta < 0){
                System.out.println("Phương trình Vô nghiệm");
            }
            else if(Delta == 0 ){
                System.out.println("Phương trình có nghiệm kép : " + -b/(2*a));
            }
            else if(Delta > 0 ){
                double Can_2_cua_delta = Math.sqrt(Delta);
                double Nghiem_1 = (-b + Can_2_cua_delta)/(2*a);
                double Nghiem_2 = (-b - Can_2_cua_delta)/(2*a);
                System.out.println("Phương trình có 2 nghiệm lần lượt là : " + Nghiem_1 + " , " + Nghiem_2);
            }
        }
    }
}
