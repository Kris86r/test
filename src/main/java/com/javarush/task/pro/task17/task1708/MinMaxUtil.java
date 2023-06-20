package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {

    public static int min(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static int max(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int min(int number1, int number2, int number3) {
        return min(min(number1, number2), number3);
    }

    public static int max(int number1, int number2, int number3) {
        return max(max(number1, number2), number3);
    }

    public static int min(int number1, int number2, int number3, int number4) {
        return min(min(number1, number2, number3), number4);
    }

    public static int max(int number1, int number2, int number3, int number4) {
        return max(max(number1, number2, number3), number4);
    }

    public static int min(int number1, int number2, int number3, int number4, int number5) {
        return min(min(number1, number2, number3, number4), number5);
    }

    public static int max(int number1, int number2, int number3, int number4, int number5) {
        return max(max(number1, number2, number3, number4), number5);
    }
}
                                  





























