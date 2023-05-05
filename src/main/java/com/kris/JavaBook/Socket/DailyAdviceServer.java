package com.kris.JavaBook.Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
Эта программа создает ServerSocket и ожидает клиентские запросы. При получении такого запроса (когда клиент
выполнил для этого приложения new Socket()) сервер создвет обьект Socket и устанавливает соединение с этим клиентом.
Сервер создает экземпляр PrintWriter (с помощью исходящего потока из сокета) и отправляет клиенту сообщение.
 */
public class DailyAdviceServer {
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее",
            "Два слова: не годится",
            "Будьте честны хотя бы сегодня. Скажите своему начальнику все, что вы *на самом деле* о нем думаете.",
            "Возможно, вам стоит выбрать другую прическу"};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242); // Благодаря ServerSocket приложение отслеживает
            // клиентские запросы на порту 4242 на том же коппьютере, где выполняется данный код.
            while (true) { // Сервер входит в постоянный цикл, ожидая клиентских подключений (и обслуживая их).
                Socket sock = serverSock.accept(); // Метод accept() блокирует приложение до тех пор, пока не поступит
                // запрос, после чего возвращает сокет (на анонимном порту) для взаимодеймтвия с клиентом.
                PrintWriter writer = new PrintWriter(sock.getOutputStream()); // Теперь мы используем соединение
                String advice = getAdvice(); // обьекта Socket с клиентом для создания экземпляра PrintWriter, после
                writer.println(advice); // чего отправляем с его помощью (println()) строку с советом. Затем мы
                writer.close(); // закрываем сокет, так как работа с клиентом закончена.
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}