package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (
                DirectoryStream<Path> filesSource = Files.newDirectoryStream(sourceDirectory)) {
            for (Path fileSource : filesSource) {
                if (Files.isRegularFile(fileSource)) {
                    Files.move(fileSource, targetDirectory.resolve(fileSource.getFileName()));
                }
            }
        } catch (Exception ex) {
            System.out.println("Something wrong " + ex);
        }
    }
}































