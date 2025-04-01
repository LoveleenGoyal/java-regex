package com.bridgelabz.extractionRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void main(String[] args) {
        String regex = "\\bhttps?://([a-zA-Z0-9]+\\.)?[A-Za-z0-9]+\\.[a-zA-Z]{2,}\\b";

        String text = "Visit https://www.google.com and http://example.org for more info.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
