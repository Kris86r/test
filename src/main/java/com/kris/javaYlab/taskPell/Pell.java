package com.kris.javaYlab.taskPell;

import java.util.Scanner;

import static java.lang.Math.*;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            double sq = sqrt(2);
            double pell = ((pow((1 + sq), n)) - (pow((1 - sq), n))) / (2 * sq);
            System.out.println(round(pell));
        }
    }
}
