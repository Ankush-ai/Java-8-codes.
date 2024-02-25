package Streams;
import java .util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
public class mapToDoubleStreamEx {
    public static void main (String args[]){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        DoubleStream dubStream=integers.stream().mapToDouble(x-> x*x);
        dubStream.forEach(System.out::println);
    }
    
}
