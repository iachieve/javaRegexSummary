package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AVMatcherMatches {
    private static final String REGEX = "bar";
    private static final String INPUT = "baroooooo";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        // returns true if, and only if, a prefix of the input sequence matches this matcher's pattern
        System.out.println(matcher.lookingAt());
        // returns true if, and only if, the entire region sequence matches this
        System.out.println(matcher.matches());
    }
}
