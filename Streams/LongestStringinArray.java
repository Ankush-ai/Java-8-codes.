package Streams;
import java.util.Arrays;
public class LongestStringinArray {
    public static void main(String args[]){
        String [] s={"apple", "banana", "kiwi", "orange"};
        int maxLenght=Arrays.stream(s)
        .mapToInt(String::length)
        .max().orElse(0);

        System.out.println(maxLenght);
    }
    
}
