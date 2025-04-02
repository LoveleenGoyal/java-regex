package com.bridgelabz.advancedRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguages {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++", "Go", "JavaScript"};

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Languages matched: " + matcher.group());
        }
    }
}
