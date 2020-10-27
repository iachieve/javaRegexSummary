package dev.practice.two;

public class AGValidateIPAddress {

    private static final String IP_ADDRESS_REGEX = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {

        System.out.println("2.134.213.2".matches(IP_ADDRESS_REGEX));
    }
}
