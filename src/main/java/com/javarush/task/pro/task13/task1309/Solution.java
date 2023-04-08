package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Elon Mask", 5.5);
        grades.put("Tom Hanks", 4.7);
        grades.put("Bill Gates", 3.3);
        grades.put("Angeline Joly", 4.2);
        grades.put("Mel Gibson", 3.1);
    }
}






























