package com.kris.draft.Repeat1317;

import java.util.Arrays;


public class Month {
    private static final Month JANUARY = new Month(1);
    private static final Month FEBRUARY = new Month(2);
    private static final Month MARCH = new Month(3);
    private static final Month APRIL = new Month(4);
    private static final Month MAY = new Month(5);
    private static final Month JUNE = new Month(6);
    private static final Month JULY = new Month(7);
    private static final Month AUGUST = new Month(8);
    private static final Month SEPTEMBER = new Month(9);
    private static final Month OCTOBER = new Month(10);
    private static final Month NOVEMBER = new Month(11);
    private static final Month DECEMBER = new Month(12);

    public static Month[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
            NOVEMBER, DECEMBER};

    private final int num;

    private Month(int num) {
        this.num = num;
    }

    public String values() {
        return Arrays.toString(months);
    }

    public int ordinal() {
        return num;
    }
}

