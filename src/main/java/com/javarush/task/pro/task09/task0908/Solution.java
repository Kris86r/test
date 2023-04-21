package com.javarush.task.pro.task09.task0908;

public class Solution {

    private static final String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    private static final String hex = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                return "";
            }
        }
        int remainder = binaryNumber.length() % 4;
        if (remainder != 0) {
            binaryNumber = "0".repeat(4 - remainder) + binaryNumber;
        }
        String[] array = new String[binaryNumber.length() / 4];
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            array[i / 4] = binaryNumber.substring(i, i + 4);
        }

        StringBuilder res = new StringBuilder();
        for (String el : array) {
            for (int i = 0; i < binary.length; i++) {
                if (el.equals(binary[i])) {
                    char str = hex.charAt(i);
                    res.append(str);
                }
            }
        }

        return res.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char el : hexNumber.toCharArray()) {
            for (int i = 0; i < hex.length(); i++) {
                if (el == hex.charAt(i)) {
                    result.append(binary[i]);
                    break;
                }
                if (i == hex.length() - 1) {
                    return "";
                }
            }
        }

//        for (char el : hexNumber.toCharArray()) {
//            int index = hex.indexOf(el);
//            if (index == -1) {
//                return "";
//            }
//          result.append(binary[index]);
//        }
        return result.toString();
    }
}





























