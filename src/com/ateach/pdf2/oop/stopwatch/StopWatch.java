package com.ateach.pdf2.oop.stopwatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    private String startTime;
    private String endTime;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    StopWatch(){
        startTime = formatter.format(date);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void start(){
        setStartTime(String.valueOf(System.nanoTime()));
    }

    public void end(){
        setEndTime(String.valueOf(System.nanoTime()));
    }

    public void getElapsedTime() {
        long milisecond = 0;
        milisecond = Long.parseLong(endTime) - Long.parseLong(startTime) ;
        double seconds = (double)milisecond / 1_000_000_000.0;
        System.out.println("Solution Time : "+seconds+"s");
    }

}
