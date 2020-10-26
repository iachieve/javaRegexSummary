package dev.practice.one;

import java.util.regex.Pattern;

public class APQuantifierReview {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d{1,4}", "9"));
        System.out.println(Pattern.matches("\\d{1,4}", "98"));
        System.out.println(Pattern.matches("\\d{1,4}", "9888"));
        System.out.println(Pattern.matches("\\d{1,4}", "9888888888"));
    }
}
