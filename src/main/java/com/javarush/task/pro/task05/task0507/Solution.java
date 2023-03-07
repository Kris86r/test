package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);
    }
}






























