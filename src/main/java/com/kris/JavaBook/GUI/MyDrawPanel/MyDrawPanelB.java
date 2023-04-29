package com.kris.JavaBook.GUI.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanelB extends JPanel {
    /*
    Изображаем JPEG
    */

    public void paintComponent(Graphics g) {

        Image image = new ImageIcon("C:\\Users\\Kris\\Desktop\\Wednesday\\Duck.jpg").getImage();

        g.drawImage(image, 3, 4, this); // Координаты x и y для верхнего левого угла картинки. Код
    } // говорит: "Отступить 3 пиксела от левого края панели и 4 пиксела от верхнего". Эти числа всегда
}  // относятся к виджету (в одном случае к вашему наследнику JPanel), а не ко всему фрейму.