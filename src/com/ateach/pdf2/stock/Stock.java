package com.ateach.pdf2.stock;

import java.text.DecimalFormat;

public class Stock {
    String  symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    String changePercentString;
    double changePercent;

    Stock(String symbols, String names){
        this.symbol =symbols;
        this.name = names;
    }

    public String getChangePercent(double previousClosingPrice, double currentPrice ){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);

        if(previousClosingPrice < currentPrice){
            changePercent =   ((currentPrice - previousClosingPrice)*100)/ previousClosingPrice;
            changePercentString =  "increase "+df.format(changePercent);
        }else{
            changePercent = ((previousClosingPrice - currentPrice ) *100)/ currentPrice;
            changePercentString =  "decrease "+df.format(changePercent);
        }
        return changePercentString;
    }

    public void displayInfoChange(){
        System.out.println("Stock symbol: "+ symbol +" Name: "+name+" ChangePercent: " +changePercentString +"%");
    }

}


