package com.kris.draft;

public class BubbleSort {
    public static int[] numbers = new int[]{88, 33, 68, -45, 12, -4, 9, 6};

    public static void main(String[] args) {
        sort(numbers);
        for (int nums : numbers) {
            System.out.println(nums);
        }
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
