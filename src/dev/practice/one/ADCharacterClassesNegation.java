package dev.practice.one;

import java.util.regex.Pattern;

public class ADCharacterClassesNegation {
    public static void main(String[] args) {
        // return true only if the string length is 1 and doesn't equal a, b, or c
        System.out.println("[^abc] matches a = " + Pattern.matches("[^abc]", "a"));
        System.out.println("[^abc] matches b = " + Pattern.matches("[^abc]" , "b"));
        System.out.println("[^abc] matches c = " + Pattern.matches("[^abc]", "c"));
        System.out.println("[^abc] matches z = " + Pattern.matches("[^abc]", "z"));
        System.out.println("[^abc] matches zz = " + Pattern.matches("[^abc]", "zz"));
        System.out.println("[^abc] matches zzz = " + Pattern.matches("[^abc]", "zzz"));
    }
}
