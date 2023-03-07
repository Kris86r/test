package com.kris.sandbox;

public class FieldAndMethod {
    public int length;
    public int[] array;

    public FieldAndMethod(int length) {
        this.length = length;
        array = new int[length];
    }

    public int length() {
        return length;
    }

    public int[] getArray() {
        return array;
    }

}
