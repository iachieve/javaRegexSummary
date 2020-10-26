package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATMatcherFind {
    public static void main(String[] args) {
        String input = "TV price is $500";
        String regex = "(.*)(\\d+)(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
    }
}
