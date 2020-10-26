package dev.practice.one;

import java.util.regex.Pattern;

public class ABDemo {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".r", "ar"));
        System.out.println(Pattern.matches(".r", "ak"));
        System.out.println(Pattern.matches(".r", "arr"));

    }
}
