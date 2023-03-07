package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        do {
            System.out.println(str);
        } while (num > 1 && num-- < 5);
    }
}
