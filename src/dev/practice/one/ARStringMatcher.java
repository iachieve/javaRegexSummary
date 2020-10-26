package dev.practice.one;

public class ARStringMatcher {
    public static boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
    }

    public static boolean isNumberAtBeginning(String s){
//        return s.matches("[\\d].*");
        return s.matches("[0-9].*");
    }
    public static boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }
    public static void main(String[] args) {
        System.out.println(isThreeLetters("cat"));
        System.out.println(isThreeLetters("Tiger"));
        System.out.println("-------------------");
        System.out.println(isNumberAtBeginning("1ab"));
        System.out.println(isNumberAtBeginning("Hello"));
        System.out.println(isNumberAtBeginning("0Hello"));
        System.out.println("-------------------");
        System.out.println(isNoNumberAtBeginning("Hello"));
        System.out.println(isNoNumberAtBeginning("0Hello"));

    }
}
