package com.kris.JavaBook.GUI;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("Мой первый музыкальный клип");
    static MyDrawPanel m1;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGui() {
        m1 = new MyDrawPanel();
        f.setContentPane(m1);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go() {
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer(); // Создаем (и открываем) синтезатор.
            sequencer.open();
            sequencer.addControllerEventListener(m1, new int[]{127}); // Регистрируем события синтезатором. Метод,
            // отвечающий за регистрацию, принимает обьект слушателя и целочисленный массив, представляющий собой список
            // событий ControllerEvent, которые нам нужны. Нас интересует только одно событие - №127.
            Sequence seq = new Sequence(Sequence.PPQ, 4); // Создаем последовательность и дорожку.
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i += 4) {   // Создаем последовательность событий, чтобы ноты продолжали
                // подниматься (от ноты фортопиано 5 до ноты 61).
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 1, r, 100, i)); // Вызываем новый метод makeEvent(), чтобы
                track.add(makeEvent(176, 1, 127, 0, i)); // создать сообщение и событие, а затем
                track.add(makeEvent(128, 1, r, 100, i + 2)); // добавляем результаты (MidiEvent,
            } // полученное из makeEvent)) в дорожку. Они представляют собой пару включение (144) и отключения
            // воспроизведения ноты (128).

            sequencer.setSequence(seq);
            sequencer.start();            // Запускаем его.
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public MidiEvent makeEvent(int comb, int chan, int one, int two, int tick) { // Четыре параметра для сообщения
        // событие tick происходит в момент появления данного сообщения.
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comb, chan, one, two);    // Создаем сообщение и событие
            event = new MidiEvent(a, tick);        // используя параметры метода.
        } catch (Exception e) {

        }
        return event;  // Возвращаем событие (MidiEvent полностью загружено сообщением).
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener { // Нам нужно отслеживать события
        // ControllerEvent, поэтому мы реализуем интерфейс слушателя.
        boolean msg = false; // Присваиваем флагу значение false и будем устанавливать true, когда получим событие.

        public void controlChange(ShortMessage event) {
            msg = true; // Мы получили событие , поэтому присваиваем флагу значение true и вызываем repaint().
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) { // Мы должны использовать флаг, потому что другие обьекты могут запустить repaint(), а мы
                // хотим рисовать только тогда, когда произойдет событие ControllerEvent.
                Graphics2D g2 = (Graphics2D) g;

                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r, gr, b));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x, y, ht, width);
                msg = false;
            }
        }
    }
}
