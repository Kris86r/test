package com.kris.javaYlab.taskComplexNumbers;

public class Numbers {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Complex complexNumber = new Complex(3.4444);
        Complex complexNumber2 = new Complex(0, 2.774);
        Complex complexNumber3 = new Complex(1.3, 3.6);
        Complex complexNumber4 = new Complex(0);

        System.out.println(complexNumber);
        System.out.println(complexNumber2);
        System.out.println(complexNumber3);
        System.out.println(complexNumber4);
        System.out.println();
        System.out.println(calculate.addition(complexNumber2, complexNumber3));
        System.out.println(calculate.subtraction(complexNumber3, complexNumber2));
        System.out.println(calculate.multiplication(complexNumber2, complexNumber3));
        System.out.println(calculate.getModule(complexNumber3));
    }
}