package com.kris.draft;

import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try (
                FileInputStream inputStream = new FileInputStream("C:\\Users\\Kris\\Desktop\\forCheckingJavaLesons\\forJava.txt")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
