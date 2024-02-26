package Streams;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "apple", "orange"};

        String[] uniqueStrings = Arrays.stream(strings)
                .distinct()
                .toArray(String[]::new);

        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueStrings));
    }
}
