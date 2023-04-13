package com.javarush.task.pro.task13.task1319;


public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] array = {DECEMBER, JANUARY, FEBRUARY};
        return array;
    }

    public static Month[] getSpringMonths() {
        Month[] array = {MARCH, APRIL, MAY};
        return array;
    }

    public static Month[] getSummerMonths() {
        Month[] array = {JUNE, JULY, AUGUST};
        return array;
    }

    public static Month[] getAutumnMonths() {
        Month[] array = {SEPTEMBER, OCTOBER, NOVEMBER};
        return array;
    }
}






























