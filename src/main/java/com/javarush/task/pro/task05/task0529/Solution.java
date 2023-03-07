package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        }
        for (int i = 0; i < field.length; i++) {
            int x = (int) (Math.random() * 10);
            field[i][x] = robotank;
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i] = Arrays.copyOf(bombs[i], 10);
            Arrays.fill(bombs[i], 1);
            for (int j = 0; j < bombs[i].length; j++) {
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(robotank) && bombs[i][j] == 1) field[i][j] = hit;
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}






























