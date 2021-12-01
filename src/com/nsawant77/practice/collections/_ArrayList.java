package com.nsawant77.practice.collections;

import java.util.*;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2)
            return -1;
        else if (o1 > o2)
            return  1;
        else
            return 0;
    }
}

public class _ArrayList {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(9);
        l.add(3);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(2);
        l.add(8);
        l.add(7);
        //System.out.println(l);
        Collections.sort(l, (i1,i2)-> (i1<i2) ? -1 : 0);
        //System.out.println("Ascending: "+l);
        /*l.stream()
                .sorted(new MyComparator())
        .forEach((v)-> System.out.print(v));*/

        System.out.println();
        List<Employee> listOfEmp = new ArrayList<>();
        Employee e1 = new Employee("Alice", 30000, "IT");
        Employee e2 = new Employee("Nilesh", 20000, "BANKING");
        Employee e3 = new Employee("Bob", 15000, "FINANCE");
        Employee e4 = new Employee("Danny", 27000, "BILLING");
        Employee e5 = new Employee("Cally", 27000, "OPERATIONS");

        listOfEmp.add(e1);
        listOfEmp.add(e2);
        listOfEmp.add(e3);
        listOfEmp.add(e4);
        listOfEmp.add(e5);
        System.out.println("Before:");
        System.out.println(listOfEmp);

        System.out.println("After:");


        Collections.sort(listOfEmp,(o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
        /*Collections.sort(listOfEmp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });*/
        //System.out.println(listOfEmp);
        listOfEmp.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList())
                .forEach(el -> System.out.print(el+", "));

        /*listOfEmp.stream()
                .sorted().collect(Collectors.toList())
                .forEach(System.out::print);*/

    }
}
