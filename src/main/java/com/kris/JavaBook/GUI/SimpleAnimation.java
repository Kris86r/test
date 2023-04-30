package com.kris.JavaBook.GUI;


import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;  // Создаем два поля в главном классе GUI
    int y = 70;  // для координат x и y у круга.

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);   // Создаем виджеты и помещаем их во фрейм.
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();   // Говорим панели, чтобы она себя перерисовала (и мы смогли увидеть
            try {                  // круг на новом месте).
                Thread.sleep(50); // Немного замедляем процесс (иначе он будет выполняться так быстро, что вы
            } catch (Exception ex) {  // не увидите никакого движения).

            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white); // чтобы зеленый круг двигался а не размазывался!
            g.fillRect(0, 0, this.getWidth(), this.getHeight()); // Методы getWidth() и getHeight()
                                                                      // унаследованны от JPanel.
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);  // Используем постоянно обновляющиеся координаты x и y
        }                                          // у внешнего класса.
    }
}
