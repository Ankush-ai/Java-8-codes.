package Streams;

import java.util.stream.Collectors;

public class StringUperCaseWithComma {
    public static void main(String[] args) {
        String inputString = "example";

        // Convert each character to uppercase and join them with commas
        String result = inputString.chars()
                .mapToObj(c -> Character.toString((char) c).toUpperCase())
                .collect(Collectors.joining(","));

        System.out.println("Result: " + result);
    }
}
