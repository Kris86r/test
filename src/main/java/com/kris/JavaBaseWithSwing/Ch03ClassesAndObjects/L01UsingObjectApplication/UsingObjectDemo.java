package com.kris.JavaBaseWithSwing.Ch03ClassesAndObjects.L01UsingObjectApplication;

import javax.swing.*;

class MyClass {
    int number;
    char symbol;
}

public class UsingObjectDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.number = 100;
        obj.symbol = 'A';
        String text = "Число: " + obj.number + "\n";
        text += "Символ: " + obj.symbol;
        JOptionPane.showMessageDialog(null, text);
    }
}
