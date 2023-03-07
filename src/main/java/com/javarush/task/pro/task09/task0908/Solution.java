package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hex = "";
        if (!binaryNumber.equals(0) || !binaryNumber.equals(1)) {
            return hex;
        } else {
            for (int i = 0; i<binaryNumber.length(); i++) {
                
            }
            return "";
        }
    }

    public static String toBinary(String hexNumber) {

        return null;
    }
}






























