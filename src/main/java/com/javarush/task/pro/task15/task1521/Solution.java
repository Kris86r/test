package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        try (
                InputStream inputStream = url.openStream()) {
            byte[] buffer = inputStream.readAllBytes();
            Files.write(Files.createTempFile(null, null), buffer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}





























