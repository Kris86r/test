package com.kris.sandbox;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Kris\\Desktop\\forCheckingJavaLesons\\forJavaOutput.txt"));
        String text = "I Love Java!!!";
        byte[] buffer = text.getBytes();
        bufferedStream.write(buffer, 0, text.length());
        bufferedStream.close();
    }
}
