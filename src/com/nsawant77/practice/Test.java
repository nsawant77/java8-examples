package com.nsawant77.practice;

import java.io.IOException;

class Employee {

    private String name;

    Employee (String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class Test {
    public static void main(String args[])
    {
        final Employee e = new Employee("Nilesh");
        e.setName("Sawant");
        System.out.println(e.getName());
    }
}