package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;


public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException ex) {
            Throwable e = ex.getCause();
            if (e instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (e instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}





























