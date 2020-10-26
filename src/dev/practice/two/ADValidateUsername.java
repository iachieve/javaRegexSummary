package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ADValidateUsername {
    /*
    * check start and end of the line
    * match lower case, numbers, underscore, and hyphen
    * length 3 to 15
    * */
    private static final String USERNAME_REGEX = "^[a-z0-9_-]{4,15}$";

    public static void main(String[] args) {
        System.out.println(Pattern.matches(USERNAME_REGEX,"peter34"));
        System.out.println(Pattern.matches(USERNAME_REGEX,"peter_34"));
        System.out.println(Pattern.matches(USERNAME_REGEX,"peter-34"));
        System.out.println(Pattern.matches(USERNAME_REGEX,"leo"));
        System.out.println(Pattern.matches(USERNAME_REGEX,"peter@34"));

    }
}
