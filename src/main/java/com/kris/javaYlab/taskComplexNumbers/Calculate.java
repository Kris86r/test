package com.kris.javaYlab.taskComplexNumbers;

import java.text.DecimalFormat;

public class Calculate implements Calculatable {
    @Override
    public Complex addition(Complex a, Complex b) {
        return new Complex(a.getR() + b.getR(), a.getC() + b.getC());
    }

    @Override
    public Complex subtraction(Complex a, Complex b) {
        return new Complex(a.getR() - b.getR(), a.getC() - b.getC());
    }

    @Override
    public Complex multiplication(Complex a, Complex b) {
        double R = a.getR() * b.getR() - a.getC() * b.getC();
        double C = a.getR() * b.getC() + a.getC() * b.getR();
        return new Complex(R, C);
    }

    @Override
    public String getModule(Complex a) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(Math.sqrt(a.getR() * a.getR() + a.getC() * a.getC()));
    }
}
