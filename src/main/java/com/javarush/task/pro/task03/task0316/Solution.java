package com.javarush.task.pro.task03.task0316;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        if (speed > 3) {
            System.out.println("Скорость лифта слишком высокая, снижаем...");
        } else if (speed <= 3) {
            System.out.println("Скорость лифта в норме");
        } else {
            System.out.println("System error!");
        }
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    