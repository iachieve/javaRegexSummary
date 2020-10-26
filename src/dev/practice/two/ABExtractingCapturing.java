package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* specific values can be selected out of a large complex body of text.
* these values can be used in the application
*
* ()-group everything within the parenthesis as group
* | => alternation: match anyone of the sections of this group
* */
public class ABExtractingCapturing {
    public static void main(String[] args) {
        String input = "I have a cat, but I like my dog better.";
        Pattern pattern = Pattern.compile("(mouse|cat|dog|wolf)");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
