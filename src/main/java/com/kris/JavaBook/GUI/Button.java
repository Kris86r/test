package com.kris.JavaBook.GUI;

import javax.swing.*;
import java.awt.*;

public class Button {
    public static void main(String[] args) {
        Button gui = new Button();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton buttonOne = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");  // Создаем кнопки.
        JButton buttonThree = new JButton("huh?");

        panel.add(buttonOne);
        panel.add(buttonTwo);  // Добавляем кнопки на панель.
        panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
