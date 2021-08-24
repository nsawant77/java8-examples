package com.nsawant77.practice.orders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ascending {

    private static int numOfSwaps;
    private static int temp;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int []nums = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            nums[i] = a.get(i).intValue();
        }

        for(int i=0;i<nums.length; i++) {
            for(int j=0; j<nums.length-1; j++) {
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    numOfSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
        System.out.println("First Element: "+nums[0]);
        System.out.println("Last Element: "+nums[a.size()-1]);

        bufferedReader.close();
    }
}