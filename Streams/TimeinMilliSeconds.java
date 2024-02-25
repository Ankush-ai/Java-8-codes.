package Streams;

import java.util.Arrays;

public class TimeinMilliSeconds {
    public static void main(String[] args) {
        // Create a large array of numbers for demonstration
        int[] numbers = new int[1000000];
        Arrays.fill(numbers, 1);

        // Sequential Stream
        long startTimeSequential = System.currentTimeMillis();
        Arrays.stream(numbers)
                .forEach(num -> processNumber(num));
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (endTimeSequential - startTimeSequential) + " ms");

        // Parallel Stream
        long startTimeParallel = System.currentTimeMillis();
        Arrays.stream(numbers)
                .parallel() // Convert to parallel stream
                .forEach(num -> processNumber(num));
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (endTimeParallel - startTimeParallel) + " ms");
    }

    // A simple method to simulate some processing
    private static void processNumber(int num) {
        // Simulate some processing
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
