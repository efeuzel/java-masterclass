package com.uzel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        String challenge3 = "Replace all blanks with underscore";
        Pattern pattern  = Pattern.compile("I want a .*");
        Matcher matcher =  pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher =  pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String modifiedChallenge3 = challenge3.replaceAll("\\s", "_");
        System.out.println(modifiedChallenge3);

        String challenge5 = "aaabcccccccccddeffffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]*"));

        System.out.println("\n" + "Challenge 7");
        System.out.println("abcd.1234".matches("^\\w+\\.\\d+$"));
        System.out.println("abcd.1234a".matches("^\\w+\\.\\d+$"));

        System.out.println("\n" + "Challenge 8");
        String challenge8  ="abcd.135uvqz.7tzik.999";
        matcher = Pattern.compile("\\w+\\.(\\d+)").matcher(challenge8);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        System.out.println("\n" + "Challenge 9");
        String challenge9  ="abcd.135\tuvqz.7\ttzik.999\n";
        matcher = Pattern.compile("\\w+\\.(\\d+)[\\t\\n]").matcher(challenge9);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        System.out.println("\n" + "Challenge 10");
        String challenge10  ="abcd.135\tuvqz.7\ttzik.999\n";
        matcher = Pattern.compile("\\w+\\.(\\d+)[\\t\\n]").matcher(challenge10);
        while (matcher.find()) {
            System.out.println(matcher.start(1) + " to " + (matcher.end(1)-1));
        }

        System.out.println("\n" + "Challenge 11");
        String challenge11  ="{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        matcher = Pattern.compile("\\{(.*?)\\}").matcher(challenge11);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

   }
}
