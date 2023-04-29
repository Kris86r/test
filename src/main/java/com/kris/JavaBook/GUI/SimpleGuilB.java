package com.kris.JavaBook.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuilB implements ActionListener {  // Реализуем интерфейс. Код говорит
    // "Экземпляр SimpleguiB реализует интерфейс ActionListener"
    // Кнопка будетпередавать события только тем, кто реализует ActionListener.
    JButton button;

    public static void main(String[] args) {
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this); // Регистрируем нашу заинтересованность в кнопке.
        // Код говорит кнопке "Добавь меня к своему списку слушателей". передаваемый аргумент ДОЛЖЕН быть
        // обьектом класса реализуемого ActionListener!

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {  // Реализуем метод actionPerformed() интерфейса ActionListener.
        button.setText("I've been clicked!");   // это фактически метод обработки событий!
    }   // Кнопка вызывает этот метод, чтобы известить о наступлении события. Она отправляет обьект ActionEvent
}     // как аргумент, но он нам не нужен. Достаточно знать, что событие произошло.
