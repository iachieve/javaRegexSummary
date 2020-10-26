package dev.practice.one;

import java.util.regex.Pattern;

/*
        Regex       |Description
        ---------------------------------
        X?          |X occurs once or not at all    (one or no at all)
        X+          |X occurs once or more          (one or more)
        X*          |X occurs zero or more          (zero or more)
* */
public class AGRegexQuantifiersPartOne {
    public static void main(String[] args) {
        System.out.println("? quantifiers => occurs once or not at all");
        System.out.printf("[ab]? matches a = %s%n", Pattern.matches("[ab]?", "a"));
        System.out.printf("[ab]? matches b = %s%n", Pattern.matches("[ab]?", "b"));
        System.out.printf("[ab]? matches \"\" = %s%n", Pattern.matches("[ab]?", ""));
        System.out.printf("[ab]? matches ab = %s%n", Pattern.matches("[ab]?", "ab")); // length
        System.out.printf("[ab]? matches aaa = %s%n", Pattern.matches("[ab]?", "aaa"));
        System.out.printf("[ab]? matches aabbb = %s%n", Pattern.matches("[ab]?", "aabbb"));

        System.out.println("-----------------------------------");
        System.out.println("+ quantifiers => occurs alt least once");
        System.out.printf("[ab]+ matches a = %s%n", Pattern.matches("[ab]+", "a"));
        System.out.printf("[ab]+ matches aaa = %s%n", Pattern.matches("[ab]+", "aaa"));
        System.out.printf("[ab]+ matches aabbb = %s%n", Pattern.matches("[ab]+", "aabbb")); // the length here doesn't matter
        System.out.printf("[ab]+ matches aazzb = %s%n", Pattern.matches("[ab]+", "aazzb"));
        System.out.printf("[ab]+ matches \"\" = %s%n", Pattern.matches("[ab]+", ""));

        System.out.println("-----------------------------------");
        System.out.println("* quantifiers => occurs zero or more");
        System.out.printf("[ab]* matches \"\" = %s%n", Pattern.matches("[ab]*", ""));
        System.out.printf("[ab]* matches a = %s%n", Pattern.matches("[ab]*", "a"));
        System.out.printf("[ab]* matches aaa = %s%n", Pattern.matches("[ab]*", "aaa"));
        System.out.printf("[ab]* matches aaabbb = %s%n", Pattern.matches("[ab]*", "aaabbb"));
        System.out.printf("[ab]* matches aaabbbx = %s%n", Pattern.matches("[ab]*", "aaabbbx"));
    }
}
















