package com.nsawant77.practice.collections;

import java.util.HashMap;

public class _HashMap {

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 30000, "IT");
        Employee e2 = new Employee("Nilesh", 20000, "BANKING");
        Employee e3 = new Employee("Bob", 15000, "FINANCE");
        Employee e4 = new Employee("Danny", 27000, "BILLING");
        Employee e5 = new Employee("Cally", 27000, "OPERATIONS");

        HashMap<String,Employee> map = new HashMap<>();
        map.put("B",e1);
        map.put("E",e2);
        map.put("A",e3);
        map.put("C",e4);
        map.put("D",e5);
        System.out.println(map);

    }
}
