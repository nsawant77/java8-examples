package com.practice.inheritance;

import com.practice.inheritance.classes.ProtectedA;

public class TestMain {

    public static void main(String arg[]) {
        System.out.println("Hello main()");

        PrivateA p1 = new PrivateA();
        System.out.println(p1);
        ProtectedA p2 = new ProtectedA();
    }
}

