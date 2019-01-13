package com.ateach.cake;

class CakeManager {
    Cake ck[] = new Cake[2]; // set size 2 for test (require 20 item)
    int count = 0;

    public void addOrderCakeToCake(OrderCake odc) {
        ck[count] = odc;
        count++;
    }

    public void addReadyCakeToCake(ReadymadeCake rdc) {
        ck[count] = rdc;
        count++;
    }

    public void addInfoOrderCake() {
        OrderCake or = new OrderCake();
        or.addInfo();
        addOrderCakeToCake(or);
    }

    public void addInfoReadymakeCake() {
        ReadymadeCake rd = new ReadymadeCake();
        rd.addInfo();
        addReadyCakeToCake(rd);
    }

    public void displayAllCake() {
        for (int i = 0; i < ck.length; i++) {
            System.out.println(ck[i].toString());
        }
    }

    public void displayPriceAllCake() {
        double sumPriceOrderCake = 0;
        double sumPriceReadymakeCake = 0;
        for (int i = 0; i < ck.length; i++) {
            if (ck[i] instanceof OrderCake) {
                sumPriceOrderCake += ck[i].calcPrice();
            } else if (ck[i] instanceof ReadymadeCake) {
                sumPriceReadymakeCake += ck[i].calcPrice();
            }
        }
        System.out.println("Price of all cake: " + (sumPriceOrderCake + sumPriceReadymakeCake));
    }

    public void totalPriceAndQuatityReadyMakeCake() {

        double totalPrice = 0;
        double totalQuatity = 0;
        int totolOrder = 0;
        int totalWeight = 0;
        for (int i = 0; i < ck.length; i++) {
            if (ck[i] instanceof ReadymadeCake) {
                totalPrice += ck[i].calcPrice();
                totalQuatity += ((ReadymadeCake) ck[i]).quantity;
                totolOrder +=((OrderCake)ck[i]).weight;
            }
        }
        System.out.println("Total price Ready make Cake: " + totalPrice + " Total quatity: " + totalQuatity);
    }

    public void getCakeSoldHighesPrice() {
        double maxPrice = ck[0].calcPrice();
        int index = 0;
        for (int i = 0; i < ck.length; i++) {
            if (ck[i].calcPrice() > maxPrice) {
                maxPrice = ck[i].calcPrice();
                index = i;
            }
        }
        System.out.println("Cake: " + ck[index].toString() + "has been sold highest price");
    }
}



