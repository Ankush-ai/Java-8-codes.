package Streams;

import java.util.ArrayList;
public class filterCollection{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
         for(int i=0;i<1000;i++){
            list.add(i);
         }
         list.stream().filter(p -> p > 500).forEach(p -> System.out.println(p));
        
    }
    
}