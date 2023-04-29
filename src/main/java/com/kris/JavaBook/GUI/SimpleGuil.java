package com.kris.JavaBook.GUI;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGuil {
    public static void main(String[] args) {

        JFrame frame = new JFrame();                      // Создаем фрейм
        JButton button = new JButton("click me");     // и кнопку
         // Передаем конструктору кнопки текст, который будет на ней отображаться
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Эта строка завершает работу программы при
        // закрытии окна (если ее н добавить, то приложение будет "висеть" на экране вечно
        frame.getContentPane().add(button);   // Добавляем кнопку на панель фрейма
        frame.setSize(300, 300);    // Присваиваем фрейму размер (в пикселях)
        frame.setVisible(true);  // делаем фрейм видимым (если пропустить этот шаг, то выполнив данный код,
        // ничего не будет видно
    }
}
