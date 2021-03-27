package com.nsawant77.practice.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ExtractEvenNos {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(3);
        a1.add(8);
        a1.add(5);
        a1.add(33);
        a1.add(7);
        a1.add(16);
        System.out.println("Before: "+a1);

        List<Integer> even = a1.stream()
                .filter(no -> no%2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even nos: "+even);

    }
}
