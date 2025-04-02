package com.bridgelabz.advancedRegex;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        String[] ipAddresses = {"19.67.90.234", "435.678.22.22"};

        for (String ip : ipAddresses) {
            if (Pattern.matches(regex, ip)) {
                System.out.println(ip + " is a valid ip address.");
            } else {
                System.out.println(ip + " is an invalid ip address.");
            }
        }
    }
}
