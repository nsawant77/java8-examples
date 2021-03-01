package com.nsawant77.practice.interfaces;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

    //cannot have a static block
    //cannot have a constructor
}
