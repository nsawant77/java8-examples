package com.nsawant77.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class HourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int summed_up=0;
        int result = -100;
        for(int r=0; r<=3; r++){
            for(int c=0; c<=3; c++){

                int row1 = arr.get(r).get(c)+arr.get(r).get(c+1)+arr.get(r).get(c+2);
                int row2 = arr.get(r+1).get(c+1);
                int row3 = arr.get(r+2).get(c)+arr.get(r+2).get(c+1)+arr.get(r+2).get(c+2);
                summed_up = row1+row2+row3;

                //System.out.println(summed_up);

                result = Math.max(summed_up,result);
                //System.out.println(result);
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
