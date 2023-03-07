package com.kris.JavaBaseWithSwing.Ch03ClassesAndObjects.L06UsingPrivateMembersApplication;

class MyClass {
    private static int count = 0;
    private int number;
    private String name;

    MyClass(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("Создан объект с именем " + name);
    }

    public void show() {
        System.out.println("Название объекта: " + name);
        System.out.println("Номер объекта: " + number);
        System.out.println("Количество объектов: " + count);
    }

    public void set(String n) {
        name = n;
    }
}

public class UsingPrivateMembersDemo {
    public static void main(String[] args) {
        MyClass objA = new MyClass("Alpha");
        MyClass objB = new MyClass("Bravo");
        MyClass objC = new MyClass("Charlie");
        objA.show();
        objB.show();
        objC.show();
        objB.set("Второй объект");
        objB.show();
    }
}
