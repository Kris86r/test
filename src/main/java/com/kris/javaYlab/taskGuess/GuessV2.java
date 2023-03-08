package com.kris.javaYlab.taskGuess;

import java.util.Random;

import static javax.swing.JOptionPane.*;

public class GuessV2 {

    public static void main(String[] args) {
        int number = new Random().nextInt(99) + 1;
        int maxAttempts = 10;
        String title = "Угадай число";
        String text = "Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.\n";
        StringBuilder message = new StringBuilder(text);

        for (int i = 1; i <= maxAttempts; i++) {
            String input = showInputDialog(null, message, title, QUESTION_MESSAGE);
            if (input == null) System.exit(0);
            message.append("Вы ввели число: ").append(input).append("\n");
            int inputNumber = Integer.parseInt(input);
            if (inputNumber == number) {
                showMessageDialog(null, "Ты угадал с " + i + " попытки!", title, INFORMATION_MESSAGE);
                System.exit(0);
            }
            String grade = inputNumber < number ? "больше" : "меньше";
            message.append(String.format("Мое число %s! Осталось %s попыток.\n", grade, maxAttempts - i));
        }
        showMessageDialog(null, "Ты не угадал.", title, WARNING_MESSAGE);
    }
}