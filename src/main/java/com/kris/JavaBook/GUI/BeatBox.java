package com.kris.JavaBook.GUI;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BeatBox {
    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxList;  // Мы храним флажки в массиве ArrayList.
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hit-Hat", "Acoustic Snare", "Crash Cymbal",
            "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
            "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63}; // Эти числа представляют
    // собой фактические барабанные клавиши. Канал барабана - это что-то вроде фортопиано, только каждая клавиша на
    // нем - отдельный барабан. Номер 35 - это клавиша для Bass drum, а 42 - Closed Hi-Hat и т.д.
    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // (createEmptyBorder) пустая граница позволяет создать поля между краями панели и местом размещения компонентов

        checkboxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        stop.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++) {     // Создаем флажки, присваиваем им значения false (чтобы они не были
            JCheckBox c = new JCheckBox();   // установленны), а затем добавляем их в массив
            c.setSelected(false);     //  ArrayList и на панель.
            checkboxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();                                     // MIDI- код для получения
            sequence = new Sequence(Sequence.PPQ, 4);    // синтезатора, секвенсона и дорожки.
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     // Здесь все происходит! Мы преобразуем состояния флажков в  MIDI- события и добавляем их на дорожку.
    public void buildTrackAndStart() {
        int[] trackList = null;   // Создаем массив из 16 элементов, чтобы хранить значения для каждого
                          // инструмента, на все 16 тактов.
        sequence.deleteTrack(track);     // Избавляемся от старой дорожки и создаем новую.
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {  // Делаем это для каждого из 16 рядов (то есть для Bass, Congo и т.д.).
            trackList = new int[16];

            int key = instruments[i]; // Задаем клавишу, которая представляет инструмент (Bass, Hi-Hat и т.д.).
            // Массив содержит MIDI- числа для каждого инструмента.
            for (int j = 0; j < 16; j++) {   // Делаем это для каждого такта текущего ряда.
                JCheckBox jc = (JCheckBox) checkboxList.get(j + (16 * i));
                if (jc.isSelected()) {  // Установлен ли флажок на данном такте? Если да, то помещаем значение
                    trackList[j] = key;  // клавиши в текущую ячейку массива (ячейку, которая представляет такт).
                } else {  // Если нет, то инструмент не должен играть в этом такте, поэтому присваиваем ему 0.
                    trackList[j] = 0;
                }
            }

            makeTracks(trackList);  // Для этого инструмента и для всех 16 тактов создаем события
            track.add(makeEvent(176, 1, 127, 0, 16)); // и добавляем их на дорожку.
        }

        track.add(makeEvent(192, 9, 1, 0, 15)); // Мы всегда должны быть уверены, что
        try {  // событие на такте 16 существует (они идут от 0 до 15). Иначе BeatBox может не пройти все
               // 16 тактов, перед тем как заново начнет последовательность.
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);  // Позволяет задать количество повторений
            // цикла или, как в этом случае, непрерывный цикл.
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) {
            e.printStackTrace();  // Теперь мы проигрываем мелодию.
        }
    }

    public class MyStartListener implements ActionListener { // Первый из внутренних классов -
        // слушателей для кнопок.
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }

    public class MyStopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    }

    public class MyUpTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03)); // Коэффициент темпа определяет темп
        }  // синтезатора. По умолчанию он равен 1.0, поэтому щелчком кнопкой мыши можно изменить
    }      // его на +/- 3%.

    public class MyDownTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));
        }
    }
// Метод создает события для одного инструмента за каждый проход цикла для всех 16 тактов. Можно получить int[]
    // для Bass drum, и каждый элемент массива будет содержать либо клавишу этого инструмента, либо ноль. Если
    public void makeTracks(int[] list) {   // это ноль, то инструмент не доллжен играть на текущем такте. Иначе
        for (int i = 0; i < 16; i++) { // нужно создать событие и добавить его в дорожку.
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i)); // Создаем события включения и
                track.add(makeEvent(128, 9, key, 100, i + 1)); // выключения и добавляем
            }                        // их в дорожку.
        }
    }

    public MidiEvent makeEvent(int comb, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comb, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
