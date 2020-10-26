package dev.practice.one;

import java.util.regex.Pattern;

/*
        Regex       |Description
        --------------------------
        X{n}        |X occurs n times only
        X{n,}       |X occurs n or more times
        X{y,z}      |X occurs at least y times but less than or equal to z times

* */
public class AHRegexQuantifiersPartTwo {
    public static void main(String[] args) {
        System.out.println("X{n} => X occurs n time only");
        System.out.printf("[a]{3} matches aaa = %s%n", Pattern.matches("[a]{3}", "aaa"));
        System.out.printf("a{3} matches aaa = %s%n", Pattern.matches("a{3}", "aaa"));
        System.out.printf("[a]{3} matches aaaaaa = %s%n", Pattern.matches("[a]{3}", "aaaaaa")); // should only matches 3 times
        System.out.printf("[a]{3} matches aa = %s%n", Pattern.matches("[a]{3}", "aa"));
        System.out.printf("[a]{3} matches a = %s%n", Pattern.matches("a{3}", "a"));
        System.out.printf("[a]{3} matches bbb = %s%n", Pattern.matches("[a]{3}", "bbb"));

        System.out.println("-----------------------------");
        System.out.println("X{n,} => X occurs n or more times");
        System.out.printf("a{3,} matches aaa = %s%n", Pattern.matches("a{3,}", "aaa"));
        System.out.printf("a{3,} matches aaaaaa = %s%n", Pattern.matches("a{3,}", "aaaaaa"));
        System.out.printf("a{3,} matches aa = %s%n", Pattern.matches("a{3,}", "aa")); // at leas 3
        System.out.printf("a{3,} matches a = %s%n", Pattern.matches("a{3,}", "a"));
        System.out.printf("a{3,} matches bbb = %s%n", Pattern.matches("[a]{3,}", "bbb"));

        System.out.println("-----------------------------");
        System.out.println("X{y,z} => X occurs at least y times but less than or equal to z times");
        System.out.printf("a{3,6} matches aaa = %s%n", Pattern.matches("a{3,6}", "aaa"));
        System.out.printf("a{3,6} matches aaaaaa = %s%n", Pattern.matches("a{3,6}", "aaaaaa"));
        System.out.printf("a{3,6} matches aaaaaaaaa = %s%n", Pattern.matches("a{3,6}", "aaaaaaaaa"));
        System.out.printf("a{3,6} matches aa = %s%n", Pattern.matches("a{3,6}", "aa"));
        System.out.printf("a{3,6} matches a = %s%n", Pattern.matches("a{3,6}", "a"));
        System.out.printf("a{3,6} matches bbb = %s%n", Pattern.matches("a{3,6}", "bbb"));
    }
}

















