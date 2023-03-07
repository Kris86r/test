package com.kris.JavaBaseWithSwing.Ch05Arrays.L02UsingListApplication;

import javax.swing.*;

public class UsingListDemo {
    public static void main(String[] args) {
        String[] txt = {"Волк", "Лиса", "Медведь", "Енот"};
        String[] files = {"wolf.jpg", "fox.jpg", "bear.jpg", "raccoon.jpg"};
        String folder = "C:/img/";
        String msg = "Кого показать?";
        String title = "В мире животных";
        ImageIcon img = new ImageIcon(folder + "giraffe.jpg");
        String animal;
        animal = (String) JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE, img, txt, txt[0]);
        if (animal == null) {
            System.exit(0);
        }
        for (int k = 0; k < txt.length; k++) {
            if (animal.equals(txt[k])) {
                img = new ImageIcon(folder + files[k]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);
    }
}
