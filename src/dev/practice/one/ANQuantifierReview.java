package dev.practice.one;

import java.util.regex.Pattern;

// * => occurs zero or more times, short for {0,}
public class ANQuantifierReview {
    public static void main(String[] args) {
        System.out.println("* quantifier means zero or more, it's short for {0,}");
        System.out.printf("%s%n", Pattern.matches("X*", ""));
        System.out.printf("%s%n", Pattern.matches("X*", "XXX"));
        System.out.printf("%s%n", Pattern.matches("X*", "aaa"));
        System.out.println("-------------------------");
        System.out.println("+ quantifier means one or more, it's short for {1,}");
        System.out.printf("%s%n", Pattern.matches("X+", ""));
        System.out.printf("%s%n", Pattern.matches("X+", "X"));
        System.out.printf("%s%n", Pattern.matches("X+", "XXXX"));
        System.out.printf("%s%n", Pattern.matches("X+", "BBBB"));

        System.out.println("-------------------------");
        System.out.println("? quantifiers means once No or One Time");
        System.out.printf("%s%n", Pattern.matches("X?", ""));
        System.out.printf("%s%n", Pattern.matches("X?", "X"));
        System.out.printf("%s%n", Pattern.matches("X?", "XXXX"));
        System.out.printf("%s%n", Pattern.matches("X?", "BBBB"));
    }
}
