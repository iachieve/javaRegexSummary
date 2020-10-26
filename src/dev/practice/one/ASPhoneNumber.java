package dev.practice.one;

public class ASPhoneNumber {
    // 123-123-1234
    public static void main(String[] args) {
       String phoneNumberString = "123-123-1234";
       String s = "1231231234";
//       boolean res = phoneNumberString.matches("[\\d]{3}-[\\d]{3}-[\\d]{4}");
       boolean res = phoneNumberString.matches("\\d\\d\\d([-]){1}\\d\\d\\d([-]){1}\\d\\d\\d\\d");

       System.out.println(res);
        System.out.println(s.matches("[\\\\d]{3}-[\\\\d]{3}-[\\\\d]{4}"));
    }
}
