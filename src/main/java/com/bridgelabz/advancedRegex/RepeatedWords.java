package com.bridgelabz.advancedRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedWords {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)";

        String text = "This is is a repeated repeated word test.";

        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Repeated word: " + matcher.group(1));
        }
    }
}
