package com.nsawant77.practice.collections;

public class Employee {

    String name;
    Integer salary;
    String dept;

    public Employee(String name, Integer salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String toString(){
        return name+":"+dept+":"+salary;
    }
}
