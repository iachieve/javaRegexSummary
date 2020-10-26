package dev.practice.one;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AZSplit {
    private static  final String INPUT = "Mohamed_Welcome_To_USA";
    private static final String REGEX = "_";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        String[] stringArray = pattern.split(INPUT);
        System.out.println(Arrays.toString(stringArray));
    }
}
