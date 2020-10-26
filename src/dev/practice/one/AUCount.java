package dev.practice.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AUCount {

    private static final String REGEX = "\\bdog\\b";
    private  static final String INPUT = "dog dog dog dogiee dog";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.printf("found %d, at index[%d,%d] EXCLUSIVE\n", count, matcher.start(), matcher.end());
        }
    }
}
