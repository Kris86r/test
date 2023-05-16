package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream reader = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream writer = Files.newOutputStream(Path.of(scanner.nextLine()))) {
            byte[] buf = new byte[65536];
            while (reader.available() > 0) {
                int real = reader.read(buf);
                for (int i = 1; i < real; i += 2) {
                    byte temp = buf[i];
                    buf[i] = buf[i - 1];
                    buf[i - 1] = temp;
                }
                writer.write(buf, 0, real);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}































