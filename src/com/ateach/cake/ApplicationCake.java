package com.ateach.cake;

import java.util.Scanner;

public class ApplicationCake {
    public static void main(String[] args) {
        CakeManager mn = new CakeManager();
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("\t\t----------------------------------");
            System.out.println("\t\t|1. Add New Order Cake");
            System.out.println("\t\t|2. Add New Ready Make Cake");
            System.out.println("\t\t|3. Display all Cake");
            System.out.println("\t\t|4. Display price all Cake");
            System.out.println("\t\t|5. Display cake has been sold highest price");
            System.out.println("\t\t|6. Exit");
            System.out.println("\t\t--------------------------------------");
            x = in.nextInt();
            switch (x) {
                case 1:
                    mn.addInfoOrderCake();
                    break;
                case 2:
                    mn.addInfoReadymakeCake();
                    break;
                case 3:
                    mn.displayAllCake();
                    break;
                case 4:
                    mn.displayPriceAllCake();
                    break;
                case 5:
                    mn.getCakeSoldHighesPrice();
                    break;
            }
        } while (x != 0);
    }
}
