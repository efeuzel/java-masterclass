package com.uzel;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                        "N40", "N36",
                        "B12", "B6",
                        "G53", "G49", "G60", "G50", "g64",
                        "I26", "I17", "I29",
                        "O71"
        );

        someBingoNumbers
                .stream()  //creates a stream of object references in order from the array
                .map(String::toUpperCase)  //method reference is passed as the functional interface argument
                .filter(s -> s.startsWith("G")) //a predicate is passed to filter
                .sorted()
                .peek(s -> System.out.println("Intermediate operation peek result: " + s))
                .forEach(System.out::println); //this foreach is from Streams not Iterable.
                // This is a terminal operation since a stream is not returned
    }
}
