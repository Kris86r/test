package com.javarush.task.pro.task03.task0318;


import java.util.Scanner;

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = console.nextInt();
        int minutes = console.nextInt();
        if (hours > 0 || minutes > 30) {
            System.out.println(HORRIBLY_DONE);
        } else if (minutes < 30) {
            System.out.println(NOT_YET);
        } else {
            System.out.println(DONE);
        }
    }
}






























