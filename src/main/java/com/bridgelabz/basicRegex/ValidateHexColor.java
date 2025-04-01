package com.bridgelabz.basicRegex;

import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        String regex = "^[#][0-9A-Fa-f]{6}$";

        String[] colorCodes = {"#FFA500","#ff34343", "#ff4590", "#123"};

        for (String code: colorCodes) {
            if (Pattern.matches(regex, code)) {
                System.out.println(code + " is a valid color code");
            } else {
                System.out.println(code + " is an invalid color code");
            }
        }
    }
}

/*#FFA500 is a valid color code
#ff34343 is an invalid color code
#ff4590 is a valid color code
#123 is an invalid color code*/