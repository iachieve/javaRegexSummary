package dev.practice.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ACMaskPhoneNumber {
    public static void main(String[] args) {
        String input = "Grace phone number = 1231231234. Hopper phone number = 9879879876";
        Pattern pattern = Pattern.compile("(phone number = )(\\d+)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            System.out.println("Masking: " + matcher.group(2));
            matcher.appendReplacement(sb, matcher.group(1)+"***masked***");
        }
        matcher.appendTail(sb);
        System.out.println(sb);
    }
}
