package com.javarush.task.pro.task05.task0526;

import java.util.Arrays;

public class Solution {
    public static int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 5, 6, 4}};

    public static void main(String[] args) {
        printArray();
        int[] revers = array[0];
        array[0] = array[2];
        array[2] = revers;
        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}






























