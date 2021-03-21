package com.nsawant77.practice.collections;

public class Employee {

    private final String name;
    private final Integer salary;
    private final  String dept;

    public Employee(String name, Integer salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String toString(){
        return getName() +":"+ getDept() +":"+ getSalary();
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
}
