package Streams;
import java.nio.channels.IllegalSelectorException;
import java.util.Arrays;
public class SecondSmallestElement {
    public static void main (String args[]){
        int[] array={5,6,8,9,3,5,1,2,4,7,0};
        int SecondsmallestElement=findSmallestElement(array);
        System.out.println("The sceond smalles element is :" + SecondsmallestElement);
    } 

     public static int findSmallestElement(int [] array){
        if(array.length<2){
            throw new IllegalArgumentException("Array should have atlest 2 elements");
        }
        return Arrays.stream(array)
        .distinct()
        .sorted()
        .skip(1)
        .findFirst()
        .orElseThrow(()-> new IllegalSelectorException());
     }
}
