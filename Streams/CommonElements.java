package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> set2 = new HashSet<>(Arrays.asList(Arrays.stream(array2).boxed().toArray(Integer[]::new)));

        int[] commonElements = Arrays.stream(array1)
                .distinct()
                .filter(set2::contains)
                .toArray();

        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }
}
