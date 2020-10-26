package dev.practice.one;

import java.util.regex.Pattern;

public class AOQuantifierReview {
    public static void main(String[] args) {
        System.out.printf("%s%n", Pattern.matches("X{3}", "X"));
        System.out.printf("%s%n", Pattern.matches("X{3}", "XXX"));
        System.out.printf("%s%n", Pattern.matches("X{3}", "aaaa"));

        System.out.println("-------------------------");
        System.out.printf("%s%n", Pattern.matches("\\d{3}", "989"));
        System.out.printf("%s%n", Pattern.matches("\\d{3}", "9898"));

        System.out.println("-------------------------");
        System.out.printf("%s%n", Pattern.matches(".{10}", "aaaaa11111"));
        System.out.printf("%s%n", Pattern.matches(".{3}", "aa11"));

    }
}
