package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> file = Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < file.size(); i += 2) {
                System.out.println(file.get(i));
            }
        } catch (Exception ex) {
            System.out.println("Something wrong " + ex);
        }
    }
}































