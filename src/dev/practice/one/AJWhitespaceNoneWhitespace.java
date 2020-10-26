package dev.practice.one;

import java.util.regex.Pattern;

/*
            Regex       |Description
            -------------------------------------------------------------
            \s          |Any Whitespace character, short for [\t\n\x0B\f\r]
            \S          |Any non-whitespace character, short for [^\s]
* */
public class AJWhitespaceNoneWhitespace {
    public static void main(String[] args) {
        System.out.println("metacharacter s");
        System.out.printf("\\s matches \" \" = %s%n", Pattern.matches("\\s", " "));
        System.out.printf("\\s matches \"\\t\" = %s%n", Pattern.matches("\\s", "\t"));
        System.out.printf("\\s matches \"\\n\" = %s%n", Pattern.matches("\\s", "\n"));
        System.out.printf("\\s matches \"       \" = %s%n", Pattern.matches("\\s", "       ")); // the length of spaces doesn't match
        System.out.printf("\\s matches \"\\f\" = %s%n", Pattern.matches("\\s", "\f"));
        System.out.printf("\\s matches \"\\t\\t\" = %s%n", Pattern.matches("\\s", "\t\t")); // the length of the taps doesn't match
        System.out.printf("\\s matches \"ab\" = %s%n", Pattern.matches("\\s", "ab")); // doesn't contain spaces
        System.out.printf("\\s matches \"a b\" = %s%n", Pattern.matches("\\s", "a b")); // contains letters with space
        System.out.printf("\\s matches \" a\" = %s%n", Pattern.matches("\\s", " a")); // contains letters with space

        System.out.printf("\\s* matches \"     \" = %s%n", Pattern.matches("\\s*", "   "));
        System.out.printf("\\s* matches \"\\r\\r\" = %s%n", Pattern.matches("[\\s]*", "\r\r"));

        System.out.println("-----------------");

        System.out.println("metacharacter S");
        System.out.printf("\\S matches \"a\" = %s%n", Pattern.matches("[\\S]", "a") );
        System.out.printf("\\S matches \"ab\" = %s%n", Pattern.matches("[\\S]", "ab") ); // length
        System.out.printf("\\S matches \" \" = %s%n", Pattern.matches("[\\S]", " ") );
        System.out.printf("\\S matches \"\\t\" = %s%n", Pattern.matches("[\\S]", "\t") );
        System.out.printf("\\S matches \"\\n\" = %s%n", Pattern.matches("[\\S]", "\n") );
        System.out.printf("\\S matches \"\\f\" = %s%n", Pattern.matches("[\\S]", "\f") );
        System.out.printf("\\S* matches \"peter\" = %s%n", Pattern.matches("[\\S]*", "peter") );
    }
}















