package com.kris.javaYlab.taskRateLimitedPrinter;

public class RateLimitedPrinter {
    private int interval;
    private long timeLastPrint;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        if (System.currentTimeMillis() >= timeLastPrint + interval) {
            System.out.println(message);
            timeLastPrint = System.currentTimeMillis();
        }
    }
}
