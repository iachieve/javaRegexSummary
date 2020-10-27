package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AJNestedGroups {
    public static void main(String[] args) {
        String text = "John writes about this, and John Doe writes about that,"
                + " and John Wayne writes about everything.";

        String regex = "((John) (.+?))";
        //              ((group 2)(group 3)) <= Group #1
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.groupCount());
        System.out.println("--------------------------------");

        while (matcher.find()) {
            System.out.println("Group1 = " + matcher.group(1));
            System.out.println("Group2 = " + matcher.group(2));
            System.out.println("Group3 = " + matcher.group(3));
            System.out.println("--------------------------------");
        }
    }
}
