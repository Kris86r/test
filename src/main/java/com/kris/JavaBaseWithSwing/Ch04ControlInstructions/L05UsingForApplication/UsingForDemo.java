package com.kris.JavaBaseWithSwing.Ch04ControlInstructions.L05UsingForApplication;

public class UsingForDemo {
    public static void main(String[] args) {
        int s = 0, k, n = 10;
        for (k = 1; k <= n; k++) {
            s += k * k;
        }
        String txt = "Сумма квадратов чисел от 1 до " + n + ": " + s;
        System.out.println(txt);
    }
}
