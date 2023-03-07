package com.kris.JavaBaseWithSwing.Ch03ClassesAndObjects.L05UsingStaticMembersApplication;

class MyClass {
    static int count = 0;

    MyClass() {
        count++;
        System.out.println("Создан объект номер " + count);
    }

    static void show() {
        System.out.println("Количество объектов: " + count);
    }
}

public class UsingStaticMembersDemo {
    public static void main(String[] args) {
        MyClass.show();
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();
        MyClass objC = new MyClass();
        MyClass.show();
        objC.show();
        objB.show();
    }
}
