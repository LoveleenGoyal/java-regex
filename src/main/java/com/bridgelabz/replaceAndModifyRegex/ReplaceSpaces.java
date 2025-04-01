package com.bridgelabz.replaceAndModifyRegex;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String regex = "\\s+";

        String text = "This is an example with      multiple  spaces.";

        System.out.println(text.replaceAll(regex," "));
    }
}
