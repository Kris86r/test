package com.kris.JavaBook.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
    ArrayList clientOutPutStreams;

    public class ClientHundler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHundler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    }

    public void go() {
        clientOutPutStreams = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(5000);

            while (true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutPutStreams.add(writer);

                Thread t = new Thread(new ClientHundler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void tellEveryone(String message) {
        Iterator it = clientOutPutStreams.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

