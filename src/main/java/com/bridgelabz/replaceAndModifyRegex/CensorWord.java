package com.bridgelabz.replaceAndModifyRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorWord {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};

        String sentence = "This is a damn bad example with some stupid words.";

        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println(matcher.replaceAll("****"));
    }
}
