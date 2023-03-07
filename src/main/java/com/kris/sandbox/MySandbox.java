package com.kris.sandbox;

import java.util.StringTokenizer;


public class MySandbox {
    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements();
        for (String el : controlUnits) {
            System.out.println(el);
        }
    }

    public static void splitArrayElements() {
        for (int i = 0; i < controlUnits.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(controlUnits[i], "/");
            while (tokenizer.hasMoreTokens()) {
                controlUnits[i] = tokenizer.nextToken();
            }
        }
    }
}
