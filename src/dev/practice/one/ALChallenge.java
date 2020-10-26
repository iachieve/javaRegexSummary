package dev.practice.one;

import java.util.regex.Pattern;

/*
* create a regular expression that accepts alpha numeric characters only.
* Its length must be 4 characters long only.
* */
public class ALChallenge {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\w*\\d*]{4}", "Juli"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Ju22"));
        System.out.println(Pattern.matches("[\\w*\\d*]{4}", "Peter")); // more than 4 chars
        System.out.println(Pattern.matches("[\\w*\\d*]{4}", "15bc"));
        System.out.println(Pattern.matches("[\\w*\\d*]{4}", "J$22")); // $ isn't matched
    }
}
