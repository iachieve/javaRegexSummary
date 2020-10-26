package dev.practice.two;

import java.util.regex.Pattern;

public class AAReview {
    public static void main(String[] args) {
        // check string contains zero or more non digits
        System.out.println(Pattern.matches("\\D*", "Mohamed")); // checking for any zero or more digits
        System.out.println(Pattern.matches("\\D*", "Mostafa123")); // checking for any zero or more digits
        System.out.println("-------------------");
        /*Boundary Matchers example
                ^ denotes start of the line
                $ denotes end of the line
         */
        System.out.println(Pattern.matches("^This$", "This is Awesome"));
        System.out.println(Pattern.matches("^This$", "This"));
        System.out.println(Pattern.matches("^This$", "This Won't Work"));
    }
}
