package com.kris.JavaBook.GUI.MyDrawPanel;

import java.awt.*;

public class MyDrawPanelD extends Panel {
    public void paintComponent(Graphics g) {  // Это настоящий обьект Graphics2D, замаскированный под простой
        // обьект Graphics.
        Graphics2D g2d = (Graphics2D) g; // Указываем его, чтобы иметь возможность вызвать нечто такое, что есть
        // у Graphics2D, но отсутствует у Graphics.
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        // (начальная точка, начальный цвет, конечная точка, конечный цвет).
        g2d.setPaint(gradient); // Здесь мы назначаем для виртуальной кисти градиент вместо сплошного цвета.
        g2d.fillOval(70, 70, 100, 100); // метод fillOval в данном случае позволяет закрасить
    }  // овал тем, что находится на кисти - градиентом.
}
