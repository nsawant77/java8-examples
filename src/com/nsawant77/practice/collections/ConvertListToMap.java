package com.nsawant77.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a:b");
        al.add("c:d");
        al.add("e:f");
        al.add("g:h");

        System.out.println("Array List: "+al);

        Map m1 = al.stream()
                .collect(Collectors.toMap(o1->o1.split(":")[0],o2->o2.split(":")[1]));

        System.out.println("Converted to Map: "+m1);
        System.out.println("Print only:");
        al.stream()
                .sorted(C)
        .map(item->item.split(":"))
        .forEach(item -> System.out.println(item[0]+ " "+item[1]));
    }
}
