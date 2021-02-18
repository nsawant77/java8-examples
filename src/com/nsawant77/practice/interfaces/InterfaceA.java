package com.nsawant77.practice.interfaces;

//If you know the full implementation
public interface InterfaceA {

    //variables public static final by default
    //variables cannot be private, protected, transient, volatile
    //must need to initialized
    int x = 0;


    //public abstract by default
    //cannot be private, protected, strictfp, synchronized, native
    void getData();

    public abstract String getValue();
}
