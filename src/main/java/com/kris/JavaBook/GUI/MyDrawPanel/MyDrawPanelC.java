package com.kris.JavaBook.GUI.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanelC extends JPanel {
    /*
  Рисуем на черном фоне круг произвольного цвета
  */
    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight()); // Закрасим всю панель черным (цвет по умолчанию).
// Два первых аргумента определяют координаты верхнего левого угла по отношению к панели, где начнется рисование.
// Здесь 0,0 означает: "Начни с 0 пикселов от левого края и 0 пикселов от верхнего". Два других аргумента говорят:
// "Сделай ширину прямоугольника, как у панели (this.getWidth()), и высоту такую же, как у панели (this.getHeight())".
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue); // Вы можете задать цвет тремя целыми числами,
        // представляющими RGB - значения.
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100); // Начинаем рисование с 10 пикселов слева и 10 пикселов
    }   // сверху, а также задаем ширину и высоту по 100 пикселов.
}
