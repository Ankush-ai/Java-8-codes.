package Streams;
import java.util.ArrayList;
public class printCollection {
    public static void main (String arsgs[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

       list.forEach(i -> System.out.println(i));
    }
}
