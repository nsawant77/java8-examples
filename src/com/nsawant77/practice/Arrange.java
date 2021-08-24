package com.nsawant77.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface UserValidation extends Function<Arrange.User, Boolean>{

    UserValidation isFirstNameValid = user -> user.getFirstName().length()<=20 && user.getFirstName().matches("^[a-z]+$");
    UserValidation isEmailValid = user -> user.getEmail().length()<=50 && user.getEmail().matches("^[a-z@.]+$")
                                            && user.getEmail().endsWith("@gmail.com");

}

public class Arrange {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> list = new ArrayList<>();
        List<String> sorted = new ArrayList<>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().split(" ");

                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];

                if(UserValidation.isFirstNameValid.apply(new User(firstName,emailID)) && UserValidation.isEmailValid.apply(new User(firstName,emailID))){
                    list.add(firstName);
                }


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        sorted = list.stream().sorted().collect(Collectors.toList());
        sorted.forEach(System.out::println);
        bufferedReader.close();
    }

    public static class User {

        private  String firstName;
        private String email;

        public User(String firstName, String email){
            this.firstName = firstName;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
