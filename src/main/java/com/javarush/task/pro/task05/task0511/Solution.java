package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < multiArray.length; i++) {
            int s = scanner.nextInt();
            multiArray[i] = new int[s];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++)
                System.out.print(multiArray[i][j] + " ");
            System.out.println();
        }
    }
}






























