package com.nsawant77.practice.exception;

import java.util.Scanner;

public class CarMain {

    public static void main(String []arguments) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter type of car state:");

            Integer state = scan.nextInt();
            System.out.println(CarState.invokeState(state));
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
