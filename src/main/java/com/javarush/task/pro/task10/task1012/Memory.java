package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] ar = new String[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                ar[j++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = ar[i];
        }
    }
}































