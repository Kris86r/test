package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        boolean isTrue = true;
        try (
                Scanner scanner = new Scanner(System.in)) {
            Path path = Path.of(scanner.nextLine());
            while (isTrue) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                    path = Path.of(scanner.nextLine());
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                    path = Path.of(scanner.nextLine());
                } else {
                    isTrue = false;
                }
            }
        } catch (Exception ex) {
            System.out.println("Something wrong " + ex);
        }
    }
}































