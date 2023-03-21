package com.kris.javaYlab.taskPell;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long result = 0;
            long[] array = new long[n + 2];
            array[1] = 1;
            if (n > 1) {
                for (int i = 2; i < array.length - 1; i++) {
                    array[i] = 2L * array[i - 1] + array[i - 2];
                    result = array[i];
                }
            }
            System.out.println(result);
        }
        //     try (Scanner scanner = new Scanner(System.in)) {
        //         int n = scanner.nextInt();
        //         double sq = sqrt(2);
        //         double pell = ((pow((1 + sq), n)) - (pow((1 - sq), n))) / (2 * sq);
        //         System.out.println(round(pell));
        //     }
    }
}
