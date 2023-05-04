package com.kris.javaYlab.taskRateLimitedPrinter;

public class RateLimitedPrinter {
    private int interval;
    private long timeLastPrint;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        if (System.currentTimeMillis() >= timeLastPrint + this.interval) {
            System.out.println(message);
            this.timeLastPrint = System.currentTimeMillis();
        }
    }
}
