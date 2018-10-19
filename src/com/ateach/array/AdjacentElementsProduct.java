package com.ateach.array;

public class AdjacentElementsProduct {
    int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for(int i = 1; i < inputArray.length - 1 ; i++){
            int product = inputArray[i]* inputArray[i+1];
            if(product > maxProduct){
                maxProduct = product;
            }
        }
        return maxProduct;
    }
}
