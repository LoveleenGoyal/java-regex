package com.bridgelabz.basicRegex;

import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";

        String[] names = {"user_123", "us" , "123User", "User123", "userUserUSER123__"};

        for (String name: names) {
            if (Pattern.matches(regex,name)) {
                System.out.println(name + " is a Valid username");
            }
            else {
                System.out.println(name + " is an Invalid username");
            }
        }
    }
}
