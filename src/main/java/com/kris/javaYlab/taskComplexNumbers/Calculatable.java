package com.kris.javaYlab.taskComplexNumbers;

public interface Calculatable {
    Complex addition(Complex a, Complex b);

    Complex subtraction(Complex a, Complex b);

    Complex multiplication(Complex a, Complex b);

    String getModule(Complex a);
}
