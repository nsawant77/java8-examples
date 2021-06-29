package com.nsawant77.practice.multithreading;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8ParallelStreamMain {
    public static void main(String[] args) {
        int nos[] = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("-------Sequential stream()---------");

        IntStream seqStream = Arrays.stream(nos);
        seqStream.forEach(no -> System.out.println(no + " "+Thread.currentThread().getName()));

        System.out.println("-------Parallel stream()---------");

        IntStream paraStream = Arrays.stream(nos).parallel();
        paraStream.forEach(no -> System.out.println(no + " "+Thread.currentThread().getName()));
    }
}
