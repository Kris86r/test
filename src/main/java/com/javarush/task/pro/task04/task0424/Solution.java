package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int num;
        do {
            num = bombInterface.nextInt();
            System.out.println(num);
        } while (bombInterface.hasNextInt() && num % 10 != 0);
    }
}































