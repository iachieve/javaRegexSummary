package dev.practice.one;

import java.util.regex.Pattern;

/*
        |character class            |   description
        ------------------------------------------------------------------
        | [a-zA-Z]                  |    a through z or A through Z, inclusive (range) - Means any character that is a-z OR A-Z
        | [a-d[m-p]]                | a through d, or m through p:[a-dm-p] (union) - Means any character that is a-d OR m-p
*/
public class AERange {
    public static void main(String[] args) {
        System.out.println("[a-d[m-p]] matches a = " + Pattern.matches("[a-d[m-p]]", "a"));
        System.out.println("[a-d[m-p]] matches n = " + Pattern.matches("[a-d[m-p]]", "n"));
        System.out.println("[a-d[m-p]] matches e = " + Pattern.matches("[a-d[m-p]]", "e"));
        System.out.println("[a-d[m-p]] matches A = " + Pattern.matches("[a-d[m-p]]", "A"));
        System.out.println("[a-d[m-p]] matches am = " + Pattern.matches("[a-d[m-p]]", "am")); // length
        System.out.println("----------------------");
        System.out.println("[a-zA-Z] matches A = " + Pattern.matches("[a-zA-Z]", "A"));
        System.out.println("[a-zA-Z] matches d = " + Pattern.matches("[a-zA-Z]", "d"));
        System.out.println("[a-zA-Z] matches ddzy = " + Pattern.matches("[a-zA-Z]", "ddzy")); // length
        System.out.println("[a-zA-Z] matches 1 = " + Pattern.matches("[a-zA-Z]", "1"));
    }
}
