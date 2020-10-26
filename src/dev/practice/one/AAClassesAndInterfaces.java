package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AAClassesAndInterfaces {
    public static void main(String[] args) {
        // first
        Pattern pattern = Pattern.compile(".r");
        Matcher matcher = pattern.matcher("ar");
        System.out.println(matcher.matches());

        // second
        System.out.println(Pattern.compile(".r").matcher("ar").matches());

        // third
        System.out.println(Pattern.matches(".r", "ar"));

    }
}
