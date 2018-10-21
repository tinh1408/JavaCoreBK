package com.ateach.method;

public class BaiTap {
/*  #1. Given the string, check if it is a palindrome.*/
    public static void isPalindrome(){
        String str = "abvffvba";
        boolean isPa = false;
        System.out.println(str.length());
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPa = false;
                break;
            }else{
                isPa = true;
            }
        }
        System.out.println(isPa);
    }

    /* #2.Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.*/

/* #3. After they became famous, the CodeBots all decided to move to a new building and live together.
    The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains
    an integer that represents the price of the room. Some rooms are free (their cost is 0),
    but that's probably because they are haunted, so all the bots are afraid of them. That is why any room
    that is free or is located anywhere below a free room in the same column is not considered suitable for
    the bots to live in. Help the bots calculate the total price of all the rooms that are suitable for them.*/

    public static void giaPhong(){
        int[][] rooms = {{0, 1, 1, 2},
                         {0, 5, 0, 0},
                         {2, 0, 3, 3}};
        int sum = 0;
        for(int cot =0; cot <rooms[0].length; cot++) {
            for (int hang = 0; hang < rooms.length; hang++) {
                if(rooms[hang][cot] == 0){
                    break;
                }else{
                    sum = sum+rooms[hang][cot];
                }
            }
        }
        System.out.println(sum);
    }

}
