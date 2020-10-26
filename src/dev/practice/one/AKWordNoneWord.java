package dev.practice.one;

import java.util.regex.Pattern;

/*
*       Regex       |Description
*       -----------------------------------------------------
*       \w          |Any word character, short for [a-zA-Z_9-9]
*       \W          |Any non-word character, short for [^\w\
* */
public class AKWordNoneWord {
    public static void main(String[] args) {
        System.out.println("metacharacter w");
        System.out.printf("\\w matches a = %s%n", Pattern.matches("\\w", "a"));
        System.out.printf("\\w matches 9 = %s%n", Pattern.matches("\\w", "9"));
        System.out.printf("\\w matches _ = %s%n", Pattern.matches("\\w", "_"));
        System.out.printf("\\w matches a9 = %s%n", Pattern.matches("\\w", "a9")); // length
        System.out.printf("\\w* matches peter_99 = %s%n", Pattern.matches("\\w*", "peter_99"));
        System.out.printf("\\w* matches peter_99@ = %s%n", Pattern.matches("\\w", "peter_99@"));

        System.out.println("----------------------------");
        System.out.println("metacharacter W");
        System.out.printf("\\W matches @ = %s%n", Pattern.matches("\\W", "@"));
        System.out.printf("\\W matches a = %s%n", Pattern.matches("\\W", "a"));
        System.out.printf("\\W matches 9 = %s%n", Pattern.matches("\\W", "9"));
        System.out.printf("\\W matches @@ = %s%n", Pattern.matches("\\W", "@@"));
        System.out.printf("\\W* matches @@ = %s%n", Pattern.matches("\\W*", "@@"));
        System.out.printf("\\W* matches @@peter = %s%n", Pattern.matches("\\W*", "@@peter"));

    }
}
