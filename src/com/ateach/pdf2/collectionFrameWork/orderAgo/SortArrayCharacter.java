package com.ateach.pdf2.collectionFrameWork.orderAgo;

public class SortArrayCharacter {
    String[] sortByLength(String[] inputArray) {
        int i, j, k;
        String swap;
        for (i = 0; i < inputArray.length; i++)
        {
            for (j = i; j < inputArray.length; j++)
            {
                if (inputArray[i].length() > inputArray[j].length())
                {
                    for (k = j; k > i; k--)
                    {
                        swap = inputArray[k];
                        inputArray[k] = inputArray[k-1];
                        inputArray[k-1] = swap;
                    }
                }
            }
        }
        return inputArray;
    }
}
