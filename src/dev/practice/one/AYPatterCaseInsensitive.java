package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AYPatterCaseInsensitive {
    private static final String INPUT = "peter welcome to USA";
    private static final String REGEX = ".*WeLcOme.*";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(INPUT);
        System.out.println("is matched = " + matcher.matches());
    }
}
