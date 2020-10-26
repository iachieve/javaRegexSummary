package dev.practice.one;

import java.util.regex.Pattern;

/*
        |Character Class        |Description
        ==============================================
        |[a-z&&[def]]           |d, e, or f (intersection)
        |[a-z&&[^bc]]           |a through z, except for b and c (subtraction)
        |[a-z&&[^m-p]]          |a through z, and not m through p (subtraction)

* */
public class AFIntersectionSubtraction {
    public static void main(String[] args) {
        // any single character string consists of the intersected range d or e or f, returns true
        System.out.println("[a-z&&[def]] matches d = " + Pattern.matches("[a-z&&[def]]", "d"));
        System.out.println("[a-z&&[def]] matches e = " + Pattern.matches("[a-z&&[def]]", "e"));
        System.out.println("[a-z&&[def]] matches f = " + Pattern.matches("[a-z&&[def]]", "f") );
        // z not included in the intersection
        System.out.println("[a-z&&[def]] matches z = " + Pattern.matches("[a-z&&[def]]", "z") );
        // the pattern designed to match ONE single character
        System.out.println("[a-z&&[def]] matches def = " + Pattern.matches("[a-z&&[def]]", "def"));

        System.out.println("----------------------------------------");
        // matches single character from a-z EXCEPT b and c
        System.out.println("[a-z&&[^bc]] matches h = " + Pattern.matches("[a-z&&[^bc]]" , "h"));
        System.out.println("[a-z&&[^bc]] matches c = " + Pattern.matches("[a-z&&[^bc]]", "c"));
        System.out.println("[a-z&&[^bc]] matches hh = " + Pattern.matches("a-z&&[^bc]", "hh"));

        System.out.println("----------------------------------------");
        // matches single char from a-z EXCLUDING the range m-p [m, n, o, p]
        System.out.println("[a-z&&[^m-p]] matches b = " + Pattern.matches("[a-z&&[^m-p]]", "b"));
        System.out.println("[a-z&&[^m-p]] matches o = " + Pattern.matches("[a-z&&[^m-p]]", "o"));
        System.out.println("[a-z&&[^m-p]] matches bb = " + Pattern.matches("[a-z&&[^m-p]]", "bb"));

    }
}














