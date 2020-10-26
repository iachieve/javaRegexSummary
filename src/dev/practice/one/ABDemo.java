package dev.practice.one;

import java.util.regex.Pattern;

public class ABDemo {
    public static void main(String[] args) {

        // true (2nd char is r)
        System.out.println(Pattern.matches(".r", "ar"));

        // false (2nd char is not r)
        System.out.println(Pattern.matches(".r", "ak"));

        // false (has more than 2 char)
        System.out.println(Pattern.matches(".r", "arr"));

        // true (third char is r)
        System.out.println(Pattern.matches("..r", "par"));
    }
}
