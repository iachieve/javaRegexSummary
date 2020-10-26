package dev.practice.one;

public class AQStringMatcher {
    public static boolean isTrueCaseSensitive(String s){
        return s.matches("true");
    }

    public static boolean isTrueCaseInsensitive(String s){
        return s.matches("[Tt]rue");
    }

    public static boolean isTrueOrYes(String s){
        return s.matches("[tT]rue|[yY]es");
    }

    public static boolean containsTrue(String s){
        return s.matches(".*[tT]rue.*");
    }

    public static void main(String[] args) {
        System.out.println(isTrueCaseSensitive("true"));
        System.out.println(isTrueCaseSensitive("True"));

        System.out.println("-----------------------");
        System.out.println(isTrueCaseInsensitive("true"));
        System.out.println(isTrueCaseInsensitive("True"));
        System.out.println(isTrueCaseInsensitive("true1"));

        System.out.println("-----------------------");
        System.out.println(isTrueOrYes("true"));
        System.out.println(isTrueOrYes("yes"));
        System.out.println(isTrueOrYes("True"));
        System.out.println(isTrueOrYes("Yes"));

        System.out.println("-----------------------");
        System.out.println(containsTrue("HellotrueHello"));
        System.out.println(containsTrue("WelcomeTrueWelcome"));
        System.out.println(containsTrue("gotrgo"));
    }
}
