package dev.practice.two;

public class AHValidateTime {
    private static final String CLOCK_12_HOURS_REGEX = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
    private static final String CLOCK_24_HOURS_REGEX = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    public static void main(String[] args) {
        System.out.println("12:45".matches(CLOCK_12_HOURS_REGEX));
        System.out.println("12:45 am".matches(CLOCK_12_HOURS_REGEX));
        System.out.println("12:45am".matches(CLOCK_12_HOURS_REGEX));
    }
}
