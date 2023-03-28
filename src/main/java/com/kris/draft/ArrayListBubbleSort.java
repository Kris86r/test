package com.kris.draft;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBubbleSort {
    public static List<Integer> numbers = new ArrayList<>(Arrays.asList(88, 33, 68, -45, 12, -4, 9, 6));

    public static void main(String[] args) {
        sort();
        for (int nums : numbers) {
            System.out.println(nums);
        }
    }

    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
}
