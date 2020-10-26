package dev.practice.one;

import java.util.regex.Pattern;

/*
            Regex       |Description
            -----------------------------------------------------------
            .           |Any Character (may or may not match terminator
            \d          |Any digit, short for [0-9]
            \D          |Any non-digit, short for [^0-9]

* */
public class AIDigitNonDigit {
    public static void main(String[] args) {
        System.out.println("meta character d");
        System.out.printf("\\d matches 9 = %s%n", Pattern.matches("\\d", "9"));
        System.out.printf("[\\d] matches 9 = %s%n", Pattern.matches("[\\d]", "9"));
        System.out.printf("\\d matches dfg = %s%n", Pattern.matches("[\\d]", "dfg"));
        System.out.printf("\\d matches 888 = %s%n", Pattern.matches("[\\d]", "888")); // length
        System.out.printf("\\d matches 555abc = %s%n", Pattern.matches("\\d", "555abc"));
        System.out.printf("[\\d*] matches 56565 = %s%n", Pattern.matches("[\\d]*", "56565"));
        System.out.printf("[\\d*] matches 56565 = %s%n", Pattern.matches("[d]*", "56565")); // without escape sequence

        System.out.println("---------------------");
        System.out.println("meta character D");
        System.out.printf("\\D matches m = %s%n" , Pattern.matches("\\D", "m"));
        System.out.printf("\\D matches xds = %s%n", Pattern.matches("[\\D]", "xds")); // length
        System.out.printf("\\D matches 1 = %s%n" , Pattern.matches("\\D", "1"));
        System.out.printf("\\D matches 8989 = %s%n" , Pattern.matches("\\D", "8989"));
        System.out.printf("\\D matches 121abc = %s%n" , Pattern.matches("\\D", "121abc"));
        System.out.printf("\\D* matches  peter = %s%n" , Pattern.matches("\\D*", "peter"));

        System.out.println("---------------------");
        System.out.println("[.] matches any character (may or may not match terminator)");
        System.out.printf("[.] matches m = %s%n", Pattern.matches("[.]", "m"));
        System.out.printf("[.] matches 8 = %s%n", Pattern.matches("[.]", "8"));
        System.out.printf("[.] matches 99 = %s%n", Pattern.matches("[.]", "99")); // length
        System.out.printf("[.] matches 99 = %s%n", Pattern.matches("[.]", "99")); // length
        System.out.printf("[.] matches uiui = %s%n", Pattern.matches("[.]", "uiui")); // length

    }
}















