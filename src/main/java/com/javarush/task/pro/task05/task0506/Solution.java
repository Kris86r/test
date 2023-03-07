package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int N = scanner.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}






























