package com.bridgelabz.extractionRegex;

import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        String regex="[0-3][0-9]/[0-1][0-9]/[0-9]{4}";

        String text="The events are scheduled for 12/05/2023 , 15/08/2024 , and 29/02/2020.";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Dates: " + matcher.group());
        }
    }
}
