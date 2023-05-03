package com.kris.javaYlab.taskComplexNumbers;

public class Numbers {
    public static void main(String[] args) {

        Complex complexNumber = new Complex(3.1);
        Complex complexNumbers = new Complex(5.4, 2.7);
        Calculate calculate = new Calculate();
        double sum = calculate.summation(complexNumbers.getRealNumber(), complexNumbers.getImaginaryNumber());
        double sub = calculate.subtraction(complexNumbers.getRealNumber(), complexNumbers.getImaginaryNumber());
        double mlpl = calculate.multiplication(complexNumbers.getRealNumber(), complexNumbers.getImaginaryNumber());
        double abs = calculate.moduleReceivingOperation(complexNumber.getRealNumber());
        String str = calculate.toString(complexNumber.getRealNumber());
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mlpl);
        System.out.println(abs);
        System.out.println(str);
    }
}