package com.kris.draft;

import java.util.Scanner;

public class RepeatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println(("*".repeat(width) + "\n").repeat(height));
    }
}
