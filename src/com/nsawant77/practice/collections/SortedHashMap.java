package com.nsawant77.practice.collections;

import java.util.HashMap;

public class SortedHashMap {

    //streams api

    //filter() //map() //collect(Collectors.toMap(BiFunction) .toList() .toSet())
    //sorted(Collectors.comparing(Function) .comparingInt() .comparingDouble() .comparingLong() .naturalOrder() .reversed())
    //foreach()

    public static void main(String[] args) {

        HashMap<Employee, String> hm2 = new HashMap<>();

        hm2.put(new Employee("Nilesh", 25000, "IT"), "A");
        hm2.put(new Employee("Anand", 50000, "BANKING"), "Z");
        hm2.put(new Employee("Champion", 10000, "INSURANCE"), "C");
        hm2.put(new Employee("Don", 5000, "ADMIN"), "K");
        hm2.put(new Employee("Bob", 20000, "NON-IT"), "B");

        System.out.println(hm2);

        //hm2.compute(emp,str -> str);

    }
}
