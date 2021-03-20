package com.nsawant77.practice.methods;

import java.util.function.Predicate;

interface interfA {

    void getData();

    default String getString(){
        return "test A";
    }
}

interface interfB{
    default String getString() {
        return "test B";
    }
}

public class _DefaultMehod implements interfA, interfB {

    static Predicate<Integer> predicate = num -> num == 1;
    static Predicate<Integer> predicate1 = num -> num == 1;


    public static void main(String[] args) {
        interfA dm = new _DefaultMehod();
        System.out.println(dm.getString());
        System.out.println(dm.hashCode());
        System.out.println(predicate.or(predicate1).test(1));
        interfB ib = new _DefaultMehod();
        System.out.println(ib.getString());
        dm.getData();
    }

    @Override
    public String getString(){
        return interfA.super.getString();
    }

    public void getData() {
        System.out.println("In getData()");
    }
}
