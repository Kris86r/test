package com.javarush.task.pro.task09.task0924;


import java.util.Arrays;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (String[] i : morals) {
            for (int j = 0; j < i.length; j++) {
                if (i[j].toLowerCase().contains("killer")) {
                    i[j] = "compassion";
                } else if (i[j].toLowerCase().contains("thief")) {
                    i[j] = "fairness";
                } else if (i[j].toLowerCase().contains("bully")) {
                    i[j] = "respect";
                }
            }
        }
    }
}




























