package com.kris.javaYlab.taskGuess;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(99) + 1;
        int maxAttempts = 10;
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        do {
            int num = scanner.nextInt();
            N++;
            maxAttempts--;
            if (maxAttempts == 0) {
                System.out.println("Ты не угадал");
                break;
            }
            if (num == number) {
                System.out.println("Ты угадал с " + N + " попытки");
                break;
            } else if (num > number) {
                System.out.println("Мое число меньше! У тебя осталось " + maxAttempts + " попыток");
            } else {
                System.out.println("Мое число больше! У тебя осталось " + maxAttempts + " попыток");
            }
        }
        while (maxAttempts != 0);
    }
}