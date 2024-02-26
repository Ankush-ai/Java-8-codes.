package Streams;

import java.util.Arrays;

public class ProductExceptCurrent {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int productOfAllExceptCurrent = Arrays.stream(array)
                .reduce(1, (a, b) -> a * b);

        int[] result = Arrays.stream(array)
                .map(current -> productOfAllExceptCurrent / current)
                .toArray();

        System.out.println("Product Except Current Element: " + Arrays.toString(result));
    }
}
