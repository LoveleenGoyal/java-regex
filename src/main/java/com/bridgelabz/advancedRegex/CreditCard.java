package com.bridgelabz.advancedRegex;

import java.util.regex.Pattern;

public class CreditCard {
    public static void main(String[] args) {
        String regexVisaCard = "^(4\\d{3})(-(\\d{4})){3}$";
        String regexMasterCard = "^(5\\d{3})(-(\\d{4})){3}$";

        String text = "5123-4512-3456-7890 4123-4512-3456-7890 4579-8234-5123-4567-890";

        String[] cards = text.split("\\s+"); // Split based on spaces

        for (String card : cards) {
            if (Pattern.matches(regexVisaCard, card)) {
                System.out.println("Visa card matched: " + card);
            } else if (Pattern.matches(regexMasterCard, card)) {
                System.out.println("MasterCard matched: " + card);
            } else {
                System.out.println("Invalid card: " + card);
            }
        }
    }
}
