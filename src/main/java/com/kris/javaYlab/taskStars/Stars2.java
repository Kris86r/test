package com.kris.javaYlab.taskStars;

import java.util.Scanner;

public class Stars2 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            System.out.println(((template + " ").repeat(n) + "\n").repeat(m));
        }
    }
}