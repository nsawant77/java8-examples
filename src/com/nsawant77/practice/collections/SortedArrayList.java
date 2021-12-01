package com.nsawant77.practice.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedArrayList {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee("Nilesh", 25000, "IT");
        Employee e2 = new Employee("Anand", 50000, "BANKING");
        Employee e3 = new Employee("Champion", 10000, "INSURANCE");
        Employee e4 = new Employee("Don", 5000, "ADMIN");

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        System.out.println("Unsorted Array: "+empList);

        List salaryAsc  = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("Sorted based on salary: "+salaryAsc);

        List salaryDsc  = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("Descending based on salary: "+salaryDsc);

        System.out.println("Converted to HashMap");

        Map<String,Integer> m1 = empList.stream()
                        .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        System.out.println(m1);

        /*List nameAsc  = empList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted based on salary: "+nameAsc);*/
    }
}
