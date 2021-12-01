package com.nsawant77.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//import static java.util.stream.Collectors.toMap;

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

        System.out.println("Before: ");
        System.out.println(map);

        System.out.println("After: ");

        Map<String, Employee> newMap = map.entrySet().stream()
                //.sorted(Map.Entry.comparingByKey())
                .limit(2)
                .collect(Collectors.toMap(el1->el1.getKey(),el1->el1.getValue()));
                /*.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (el1, el2) -> el2, LinkedHashMap::new));*/
                //.forEach(System.out::print);

        System.out.println(newMap);
    }
}
