package com.bridgelabz.basicRegex;

import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";

        String[] plates = {"AB1234", "A1234B", "AB1234566", "AB9876"};

        for (String plate: plates) {
            if (Pattern.matches(regex,plate)) {
                System.out.println(plate + " is a valid number plate");
            } else {
                System.out.println(plate + " is an invalid number plate");
            }
        }
    }
}
