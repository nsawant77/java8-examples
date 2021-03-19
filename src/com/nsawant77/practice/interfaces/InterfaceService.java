package com.nsawant77.practice.interfaces;

public class InterfaceService implements InterfaceA, InterfaceB {
   /* @Override
    public void getData() {
        return;
    }*/

    //InterfaceA a = (int val) -> val*val+"";

    @Override
    public String getValue(int a) {
        return a+"";
    }
}
