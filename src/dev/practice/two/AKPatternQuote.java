package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AKPatternQuote {

    private static final String STRING_TO_BE_LITERALIZED = "dog$";
    private static final String REPLACE_STR = "cat";
    private static String INPUT_CHAR_SEQ = "The dog$ says meow All dog$ say meow.";

    public static void main(String[] args) {
        String regex = Pattern.quote(STRING_TO_BE_LITERALIZED);
        System.out.println("regex = " + regex);
        Pattern pattern = Pattern.compile(regex);
        // get a matcher object
        Matcher matcher = pattern.matcher(INPUT_CHAR_SEQ);
        INPUT_CHAR_SEQ = matcher.replaceAll(REPLACE_STR);
        System.out.println(INPUT_CHAR_SEQ);
    }
}
