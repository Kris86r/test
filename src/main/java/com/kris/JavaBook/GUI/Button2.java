package com.kris.JavaBook.GUI;

import javax.swing.*;
import java.awt.*;

public class Button2 {
    public static void main(String[] args) {
        Button2 gui = new Button2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        // Изменяем диспетчер компоновки на новый экземпляр  BoxLayout.
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Конструктору диспетчера  BoxLayout нужно знать,
        // какие компоненты он размещает (в данном случае панель) и какую ось нужно использовать
        // (мы указываем Y_AXIS для вертикального расположения).
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
