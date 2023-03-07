package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        if (N > 0) {
            for (int j = 0; j < array.length; j++) {
                array[j] = scanner.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = array.length - 1; i >= 0; i--)
                    System.out.println(array[i]);
            } else {
                for (int j = 0; j < array.length; j++) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}





























