package com.kris.javaYlab.taskSequences;

import java.util.Arrays;

public class SequencesInpl implements SequenceGenerator {
    @Override
    public void a(int n) {
        int[] array = new int[n];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += 2;
            array[i] = result;
        }
        System.out.print("A. " + Arrays.toString(array));
    }

    @Override
    public void b(int n) {
        int[] array = new int[n];
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = result;
            result += 2;
        }
        System.out.print("\n" + "B. " + Arrays.toString(array));
    }

    @Override
    public void c(int n) {
        int[] array = new int[n];
        int result = 0;
        for (int i = 1; i <= array.length; i++) {
            result = i * i;
            array[i - 1] = result;
        }
        System.out.print("\n" + "C. " + Arrays.toString(array));
    }

    @Override
    public void d(int n) {
        int[] array = new int[n];
        int result = 0;
        for (int i = 1; i <= array.length; i++) {
            result = i * i * i;
            array[i - 1] = result;
        }
        System.out.print("\n" + "D. " + Arrays.toString(array));
    }

    @Override
    public void e(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int result = 1;
            if (i % 2 != 0) {
                result = -result;
            }
            array[i] = result;
        }
        System.out.print("\n" + "E. " + Arrays.toString(array));
    }

    @Override
    public void f(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= array.length; i++) {
            int result = 0;
            result += i;
            if (i % 2 == 0) {
                result = -result;
            }
            array[i - 1] = result;
        }
        System.out.print("\n" + "F. " + Arrays.toString(array));
    }

    @Override
    public void g(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= array.length; i++) {
            int result = 0;
            result = i * i;
            if (i % 2 == 0) {
                result = -result;
            }
            array[i - 1] = result;
        }
        System.out.print("\n" + "G. " + Arrays.toString(array));
    }

    @Override
    public void h(int n) {
        int[] array = new int[n];
        int result = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 != 0) {
                result += 1;
                array[i - 1] = result;
            } else {
                array[i - 1] = 0;
            }
        }
        System.out.print("\n" + "G. " + Arrays.toString(array));
    }

    @Override
    public void i(int n) {
        int[] array = new int[n];
        int result = 1;
        for (int i = 1; i <= array.length; i++) {
            result *= i;
            array[i - 1] = result;
        }
        System.out.print("\n" + "I. " + Arrays.toString(array));
    }

    @Override
    public void j(int n) {
        int[] array = new int[n + 2];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= array.length - 1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.print("\n" + "J. " + Arrays.toString(array));
    }
}
