package com.javarush.task.pro.task03.task0301;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner console = new Scanner(System.in);
        int temp = console.nextInt();
        if (temp >= 0) {
            System.out.println(warm);
        } else {
            System.out.println(cold);
        }
    }
}































