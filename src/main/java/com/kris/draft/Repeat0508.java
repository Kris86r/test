package com.kris.draft;

import java.util.Scanner;

public class Repeat0508 {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < strings.length) {
            strings[count++] = scanner.nextLine();
        }
        scanner.close();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) continue;
            String duplicate = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (duplicate.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
