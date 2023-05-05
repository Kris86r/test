package com.kris.JavaBook.Socket;

import java.io.*;
import java.net.*;

/*
Программа создвет сокет и обьект BufferedReader с помощью других потоков, а затем считывает ону строку,
которую ей передает северное проложение, работающее на порту 4242.
 */
public class DailyAdviceClient {

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242); // Создаем соединение через сокет к приложению,
            // работающему на порту 4242, на том же компьютере, где выполняется данный код (localhost).
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader); // Подключаем BufferedReader к InputStreamReader
            // (который уже соединен с исходящим потоком сокета).
            String advice = reader.readLine(); // Метод readLine() работает точно так же, как если бы BufferedReader
            // был подключен к файлу. Иными словами, работая с методом из BufferedReader, вы не знаете (или вам
            // вам все равно), откуда пришли символы.
            System.out.println("Сегодня ты должен: " + advice);
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
