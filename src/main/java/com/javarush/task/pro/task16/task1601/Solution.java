package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;


public class Solution {

    static Date birthDate = new Date(1990, Calendar.AUGUST, 20);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int week = date.getDay();
        if (week == 1) {
            return "Понедельник";
        } else if (week == 2) {
            return "Вторник";
        } else if (week == 3) {
            return "Среда";
        } else if (week == 4) {
            return "Четверг";
        } else if (week == 5) {
            return "Пятница";
        } else if (week == 6) {
            return "Суббота";
        } else {
            return "Воскресенье";
        }
    }
}






























