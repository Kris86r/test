package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (min > num) {
                min2 = min;
                min = num;
            }
            if (min2 > num && min != num) {
                min2 = num;
            }
        }
        System.out.println(min2);
    }
}





























