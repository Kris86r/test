package com.kris.draft;

import java.util.ArrayList;

public class CheckingObject {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2.5);
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (Double) numbers.get(i);
        }
        System.out.println(sum);
    }
}
