package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*                                      
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileInputStream inputStream = new FileInputStream(scanner.nextLine());
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String text = reader.readLine();
                System.out.println(text);
            }
            inputStream.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





























