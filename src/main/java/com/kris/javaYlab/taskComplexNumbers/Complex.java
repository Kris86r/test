package com.kris.javaYlab.taskComplexNumbers;

import java.text.DecimalFormat;

public class Complex {
    private double R;
    private double C;

    public Complex(double R) {
        this.R = R;
    }

    public Complex(double R, double C) {
        this.R = R;
        this.C = C;
    }

    public double getR() {
        return R;
    }

    public double getC() {
        return C;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        if (R == 0 && C == 0) return "0";
        if (C == 0) return df.format(R);
        if (R == 0) return df.format(C) + "i";
        return df.format(R) + " + " + df.format(C) + "i";
    }
}