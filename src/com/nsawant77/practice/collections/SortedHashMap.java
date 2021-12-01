package com.nsawant77.practice.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedHashMap {

    //streams api

    //filter() //map() //collect(Collectors.toMap(BiFunction) .toList() .toSet())
    //sorted(Collectors.comparing(Function) .comparingInt() .comparingDouble() .comparingLong() .naturalOrder() .reversed())
    //foreach()

    public static void main(String[] args) {

        HashMap<String,Employee> hm2 = new HashMap<>();

        hm2.put("A",new Employee("Nilesh", 25000, "IT"));
        hm2.put("B",new Employee("Anand", 50000, "BANKING1"));
        hm2.put(null,new Employee("Knand", 50000, "BANKING2"));
        hm2.put(null,new Employee("Tnand", 50000, "BANKING3"));
        hm2.put("C",new Employee("Champion", 10000, "INSURANCE"));
        hm2.put("D",new Employee("Don", 5000, "ADMIN"));
        hm2.put("E",new Employee("Bob", 20000, "NON-IT"));

        System.out.println(hm2);

        Comparator<Employee> byValue = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());

        Map<String,Employee> sortedMap = hm2.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue(byValue)))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));

        System.out.println(sortedMap);

    }
}
