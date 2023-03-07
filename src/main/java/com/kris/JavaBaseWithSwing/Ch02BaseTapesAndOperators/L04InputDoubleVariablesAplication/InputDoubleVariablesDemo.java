package com.kris.JavaBaseWithSwing.Ch02BaseTapesAndOperators.L04InputDoubleVariablesAplication;

import javax.swing.*;

public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        result = JOptionPane.showInputDialog("Ваш рост в метрах:");
        height = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("Ваш вес в килограммах:");
        mass = Double.parseDouble(result);
        bmi = mass / height / height;
        bmi = Math.round(bmi * 100) / 100.0;
        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
        // 22.28563 2228.563 2229 22.29
    }
}
