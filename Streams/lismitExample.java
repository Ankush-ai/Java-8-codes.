package Streams;

import java.util.ArrayList;
import java.util.List;

public class lismitExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Use stream and limit to print the first 5 elements
        System.out.println("First 5 elements:");
        numbers.stream()
               .limit(5)
               .forEach(System.out::println);

        // Use stream and limit to print the first 3 even numbers
        System.out.println("\nFirst 3 even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .limit(3)
               .forEach(System.out::println);
    }
}
