package com.javarush.task.pro.task13.task1332;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static Set<String> matrixLogs = new HashSet<>();

    public static void main(String[] args) {
        fillMatrixLog();
        removeBugs();
    }


    public static void fillMatrixLog() {
        for (int i = 0; i < 400; i++) {
            matrixLogs.add("interestingLog" + i + ".log");
            if ((i > 0) && (i % 5 == 0) && (i < 295)) {
                matrixLogs.add("buahaha" + i + ".bug");
            }
        }
    }

    public static void removeBugs() {
        ArrayList<String> copyMatrixLogs = new ArrayList<>(matrixLogs);
        for (String findBugs : copyMatrixLogs) {
            if (findBugs.startsWith("buahaha")) {
                matrixLogs.remove(findBugs);
            }
        }
    }
}





























