package com.kris.JavaBaseWithSwing.Ch01Begin.L04InputDialogApplication;

import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
    }
}
