package com.ateach.pdf2.stock;

public class Stock {
    String  symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    double changePercent;

    Stock(String symbols, String names){
        this.symbol =symbols;
        this.name = names;
    }

    public double getChangePercent(double previousClosingPrice, double currentPrice ){
        if(previousClosingPrice < currentPrice){
            changePercent =  ((currentPrice - previousClosingPrice)/100);
        }else{
            changePercent =  ((previousClosingPrice - currentPrice )/100);
        }
        return changePercent;
    }

    public void displayInfoChange(){
        System.out.println("Stock symbol"+ symbol +"Name: "+name+" ChangePercent"+changePercent);
    }


}


