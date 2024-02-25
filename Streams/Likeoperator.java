package Streams;
import java.util.ArrayList;
public class Likeoperator {
    public static void main (String args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ankush",1,50000L));
        employees.add(new Employee("Rohan",2,50000L));
        employees.add(new Employee("Chirag",3,50000L));
        employees.add(new Employee("Aabid",4,50000L));
        employees.add(new Employee("Ranvijay",5,50000L));
        employees.add(new Employee("Abrar",6,50000L));
        employees.add(new Employee("Asrar",7,50000L));
        employees.add(new Employee("Aziz",8,50000L));

        employees.stream().filter(p->p.getName().startsWith("An")).forEach(p-> System.out.println(p.getName()));
    }
}
