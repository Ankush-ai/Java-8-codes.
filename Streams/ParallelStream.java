package Streams;
import java.util.Arrays;
public class ParallelStream {
    public static void main(String args[]){
        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sequential Stream");
        Arrays.stream(numbers)
        .forEach(System.out::println);

        System.out.println("Parallel Stream");
        Arrays.stream(numbers)
        .parallel()
        .forEach(System.out::println);
    }
    
}
