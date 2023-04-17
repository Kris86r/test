package com.kris.draft;

import java.util.Scanner;

public class Repeat0508 {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 6) {
            strings[count] = scanner.nextLine();
            count++;
        }
        for (int i = 0; i < strings.length; i++) {
            String copy = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (copy != null && copy.equals(strings[j])) {
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
