package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AWReplaceAll {
    private static final String REGEX = "lion";
    private static String INPUT = "The lion says meow. All lions Meow";
    private static final String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        String mutatedString = matcher.replaceAll(REPLACE);
        System.out.println(mutatedString);

    }
}
