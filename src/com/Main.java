package com;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Main {
        private static Scanner scn = new Scanner(System.in);
        static final String TIME_OPEN = "9PM";

        public static void main(String[] args) {
            inRa();
        }

//            VillaManager vl = new VillaManager();
//            int enter;
//            do{
//                System.out.println("-------------------MENU--------------------");
//                System.out.println("*    1. Check in                          *");
//                System.out.println("*    2. Swimming Pool Opening Times       *");
//                System.out.println("*    3. Service                           *");
//                System.out.println("*       3.1. Swimming Pool Service        *");
//                System.out.println("*       3.2. Rent day                     *");
//                System.out.println("*    4. Manager Villa                     *");
//                System.out.println("*       4.1. Add new bed and swimming pool*");
//                System.out.println("*       4.2. Display info villa           *");
//                System.out.println("*    0. Exit                              *");
//                System.out.println("*    4. Continues                         *");
//                System.out.println("-------------------------------------------");
//                System.out.print("    Please choose:   ");
//                String choose = scn.next();
//                switch (choose){
//                    case "1":
//                        System.out.println("Enter name of customer: ");
//                        String customerName = scn.next();
//                        System.out.println("Enter age of customer: ");
//                        int  customerAge = scn.nextInt();
//                        System.out.println("Enter V (Villa) or H(House)");
//                        String type = scn.next();
//                        System.out.println("Enter day");
//                        int day = scn.nextInt();
//                        infoCustomer(customerName,customerAge);
//                        caculatorForRent(type.toUpperCase(),day);
//                        break;
//                    case "2":
//                        swimmingPoolOpenTimes(TIME_OPEN);
//                        break;
//                    case "3.1":
//                        System.out.println("Enter time (format: hh:mm): ");
//                        String time = scn.next();
//                        swimmingPoolService(time);
//                        break;
//                    case "3.2":
//                        System.out.println("Enter money");
//                        float money = scn.nextFloat();
//                        System.out.println("Enter V (Villa) or H(House)");
//                        String types = scn.next();
//                        dayForRent(types.toUpperCase(), money);
//                        break;
//                    case "4.1":
//                        System.out.println("Enter total villa in furama resort");
//                        int total = scn.nextInt();
//                        vl.addNewVilla(total);
//                        break;
//                    case "4.2":
//                        vl.displayVillaInfo();
//                        break;
//                    default:
//                        System.out.println("Please enter valid number:");
//                        break;
//                }
//                System.out.println("Enter 0 to exit - enter 4 to continues");
//                enter = scn.nextInt();
//            }while (enter != 0);
//        }

    public static void inRa(){
        int x = -1, a[] = {1,2,3,4};
        for(int i=0;i<a.length;i++){
            if(a[i] > x){
                x = a[i];
            }
        }
        System.out.println(x);

//        int[][] a = {{2, 3, 4}, {5, 6, 7}};
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                if(i==j){
//                    System.out.print(a[i][j]);
//                }
//            }
//        }

//                int sum = 1, i = 5;
//                while(i < 7){
//                    sum += i;
//                    i++;
//                }
//                System.out.println(sum);

            }
//        //Task #1
//        int a= 5;
//        int b = a++;
//        int c = ++b;
//        int d = c--;
//
//        System.out.println(a+""+b+""+""+c+""+""+d);



    public static void infoCustomer(String name, int age){
        System.out.println("-----------Check in info-----------");
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t "+ age);
    }

    public static void swimmingPoolOpenTimes(String time ){
        System.out.println("Swimming pool open at: "+time);
    }

    public static void swimmingPoolService(String time ){
        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
        int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
        int mSum = 9*60;
        int cSum = hour * 60 + minute;
        int rTime = mSum - cSum;
        String message ="";
        if(rTime !=0){
            int hTime = rTime/60;
            int mTime = rTime%60;
            if(hTime != 0 && mTime !=0){
                message = message + hTime +" house " +mTime +" minutes";
            }else if(hTime == 0 && mTime !=0){
                message = message  + mTime +" minutes";
            }
            System.out.println("Please wait " + message);
        }else{
            System.out.println("Welcome!!!");
        }
    }

    public static void caculatorForRent(String type, int date){
        switch (type){
            case "V":
                System.out.println("You pay "+rentCharge(type, date)+" USD/" +date+" days");
                break;
            case "H":
                System.out.println("You pay "+rentCharge(type, date)+"USD/" +date+" days");
                break;
            default:
                System.out.println("No service");
                break;
        }
    }

    public static float rentCharge(String type, int date){
        float cost = 0;
        if (type.equals("V")){
            cost =  10*(float)date;
        }else if(type.equals("H")){
            cost =  5*(float)date;
        }
        return cost;
    }

    public static void dayForRent(String type, float money){
        switch (type){
            case "V" :
                System.out.println("You have "+ (int)money/10+" days ");
                break;
            case "H":
                System.out.println("You have "+(int)money/5+" days");
                break;
        }
    }
}

