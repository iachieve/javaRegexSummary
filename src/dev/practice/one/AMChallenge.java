package dev.practice.one;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// finder example
public class AMChallenge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            while (true){
                System.out.println("Enter regex pattern:");
                String regexPattern = sc.nextLine();
                Pattern pattern = Pattern.compile(regexPattern);
                Matcher matcher = pattern.matcher("God Help Me Please!!");
                boolean found = false;
                while(matcher.find()){
                    System.out.println(
                            "I found the text "
                            + matcher.group() + " starting at index "
                            + matcher.start()
                            + " and ending at index "
                            + matcher.end());
                    found = true;
                }
                if(!found){
                    System.out.println("No Match Found.");
                }
            }
        }
    }
}
