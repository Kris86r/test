package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num += scanner.nextInt();
        }
        System.out.println(num / 5);
    }
}






























