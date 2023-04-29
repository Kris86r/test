package com.kris.JavaBook.GUI;


import com.kris.JavaBook.GUI.MyDrawPanel.MyDrawPanelE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);   // Добавляет слушателя (this) к кнопке.

        MyDrawPanelE drawPanel = new MyDrawPanelE();

        frame.getContentPane().add(BorderLayout.SOUTH, button);      // Добавляет два виджета (кнопку и панель для
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);  // рисования) в две области фрейма.
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();  // Когда пользователь нажимает кнопку, вызываем для фрейма метод repaint(). Это значит,
    }   // что метод paintComponent() вызывается для каждого виджета во фрейме!
}
