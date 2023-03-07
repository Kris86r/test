package com.kris.javaYlab.taskMultTable;

public class MultiTable {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j)+ "\t");
            }
            System.out.println();
        }
    }
}

