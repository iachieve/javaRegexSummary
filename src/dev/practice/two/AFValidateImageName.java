package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AFValidateImageName {
    private static final String REGEX = "([^\\s]+\\.((?i)(jpg|png|gif|bmp))$)";
    public static void main(String[] args) {
        System.out.println("cat".matches(REGEX));
        System.out.println("cat.jPg".matches(REGEX));
        System.out.println("catjPg".matches(REGEX));
        System.out.println("ca_t.bMp".matches(REGEX));
        System.out.println("ca t.bMp".matches(REGEX));

    }
}
