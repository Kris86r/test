package com.kris.sandbox;

public class Sandbox {
    public static void main(String[] args) {
        FieldAndMethod fieldAndMethod = new FieldAndMethod(7);
        fieldAndMethod.array = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < fieldAndMethod.length; i++) {
            System.out.print(fieldAndMethod.array[i] + " ".length());
        }
        System.out.println();
        for (int i = 0; i < fieldAndMethod.length(); i++) {
            System.out.print(fieldAndMethod.array[i] + " ");
        }
    }
}
