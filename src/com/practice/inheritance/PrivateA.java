package com.practice.inheritance;

public class PrivateA {

    public PrivateA(){}

    private String getData() {
        return "Hey private ()";
    }

    @Override
    public String toString() {
        return "This is toString()" ;
    }
}