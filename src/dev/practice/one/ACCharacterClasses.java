package dev.practice.one;

import java.util.regex.Pattern;

/**
    Regex Character Classes

    |   Character Class     |       Description
    ------------------------------------------------------
    |   [abc]               |   a or b or c (simple class)
    |   [^abc]              |   any character except a or b or c (negation)
 */
public class ACCharacterClasses {
    public static void main(String[] args) {
        // returns true only if the string length is one and contains a, b, or c
        System.out.println("[abc] matches a = " + Pattern.matches("[abc]", "a"));

        System.out.println("[abc] matches b = " + Pattern.matches("[abc]", "b"));

        System.out.println("[abc] matches c = " + Pattern.matches("[abc]", "c"));

        System.out.println("[abc] matches z = " + Pattern.matches("[abc]", "z"));

        System.out.println("[abc] matches aa = " + Pattern.matches("[abc]", "aa"));

        System.out.println("[abc] matches abc = " + Pattern.matches("[abc]", "abc"));
    }
}
