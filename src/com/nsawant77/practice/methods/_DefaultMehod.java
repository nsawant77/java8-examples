package com.nsawant77.practice.methods;

interface interf {
    void getData();

    default String getString(){
        return "test";
    }

    /*default Integer hashCode(){
        return 12;
    }*/
}

public class _DefaultMehod implements interf {
    public static void main(String[] args) {
        _DefaultMehod dm = new _DefaultMehod();
        System.out.println(dm.getString());
        System.out.println(dm.hashCode());
        dm.getData();
    }

    @Override
    public String getString(){
        return "AndTest";
    }

    public void getData() {
        System.out.println("In getData()");
    }
}
