package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AXAppendReplacementAppendTail {

    private static final String REGEX = "aa";
    private static String INPUT = "aafooaafooaafooaa";
    private static final String REPLACE = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);

        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, REPLACE);
            System.out.println(sb.toString());

        }
            matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
