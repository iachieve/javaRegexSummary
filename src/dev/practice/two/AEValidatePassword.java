package dev.practice.two;

import java.util.regex.Pattern;

/*
     ((?=.*\d)(?=.*[a-z])(?=.*[@#$%]).{6,20})

     (?=.*\d)       # must contains one digit from 0-9
     (?=.*[a-z])    # must contains one lowercase char
     (?=.*[@#$%])   # must contains special symbol


* */
public class AEValidatePassword {

    public static void main(String[] args) {
        String passwordRegex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";

        System.out.println(Pattern.matches(passwordRegex,"123"));
        System.out.println(Pattern.matches(passwordRegex,"123@abc"));
        System.out.println(Pattern.matches(passwordRegex,"123abcABC@"));
    }
}















