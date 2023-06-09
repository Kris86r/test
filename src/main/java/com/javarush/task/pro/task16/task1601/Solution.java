package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;


public class Solution {

    static Date birthDate = new Date(2023, Calendar.JUNE, 9);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int week = date.getDay();
        return switch (week) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 0 -> "Воскресенье";
            default -> " ";
        };
    }
}






























