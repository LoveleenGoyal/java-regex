package com.bridgelabz.advancedRegex;

import java.util.regex.Pattern;

public class CreditCard {
    public static void main(String[] args) {
        String regexVisaCard = "^4[0-9]{15}$";
        String regexMasterCard = "^5[0-9]{15}$";

        String text = "5123451234567890 4123451234567890 4579823451234567890";

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
