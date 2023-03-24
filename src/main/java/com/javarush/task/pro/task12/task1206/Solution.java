package com.javarush.task.pro.task12.task1206;


public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isSpace(array[i])) {
                count++;
            }
        }
        return count;
    }
}






























