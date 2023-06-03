package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner;
        List<String> file = null;
        try {
            scanner = new Scanner(System.in);
            file = Files.readAllLines(Path.of(scanner.nextLine()));
            for (String el : file) {
                el = el.replace(" ", "");
                el = el.replace(",", "");
                el = el.replace(".", "");
                System.out.print(el);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}































