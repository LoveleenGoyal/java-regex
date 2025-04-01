package com.bridgelabz.extractionRegex;

import java.util.regex.*;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        String text = "Contact us at support@example.com and info@company.org";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
