package com.kris.JavaBook;

class A {
    int ivar = 7;

    void m1() {
        System.out.println("A's m1, ");
    }

    void m2() {
        System.out.println("A's m2, ");
    }

    void m3() {
        System.out.println("A's m3, ");
    }
}

class B extends A {
    @Override
    void m1() {
        System.out.println("B's m1, ");
    }
}

class C extends B {
    @Override
    void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }
}

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a2.m1();
        a2.m2();
        a2.m3();
        ;
    }
}