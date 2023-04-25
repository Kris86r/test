package com.kris.JavaBook;

class StaticSuper {

    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}
