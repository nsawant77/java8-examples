package com.nsawant77.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNo {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //int count = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> list = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());*/
        int no = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<no;i++){
            list.add(scan.nextInt());
        }


        list.stream().forEach(val ->{
            for(int i=2; i<=val/i; i++){
                if(val%i==0)
                    val=1;
            }
            if(val==1)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
        });
    }
}
