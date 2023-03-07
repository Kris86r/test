package com.kris.JavaBaseWithSwing.Ch02BaseTapesAndOperators.L05InputVariablesConsoleApplication;

import java.util.Scanner;

public class InputVariablesConsoleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int now = 2023;
        String name;
        int age;
        double height;
        double mass;
        System.out.print("Ваше имя: ");
        name = input.nextLine();
        System.out.print("Ваш возвраст: ");
        age = input.nextInt();
        System.out.print("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.print("Масса тела (в килограммах): ");
        mass = input.nextDouble();
        double bmi = mass / height / height;
        System.out.println("Здравствуйте, " + name + "!");
        System.out.println("Вы родились в " + (now - age) + " году.");
        System.out.printf("Ваш индекс массы тела: %5.2f\n", bmi);
    }
}
