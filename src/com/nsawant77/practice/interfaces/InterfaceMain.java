package com.nsawant77.practice.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceA im = new InterfaceService();
        InterfaceService is = new InterfaceService();
        System.out.println(im.getValue(1));
        System.out.println(is.getValue(2));

        InterfaceB ib = num -> num*num+"";
        System.out.println(ib.getValue(2));
    }
}
