package com;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

class MainTest {
    boolean almostIncreasingSequence(int[] sequence) {
        boolean issq = true;
        for(int i = 0; i <sequence.length-1; i ++){
            if((sequence[i+1]-sequence[i]) ==1){
                issq = true;
            }else{
                issq = false;
                break;
            }

        }
        return issq;
    }
}

