package Streams;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class Max_salary {
    public static class Employee{
       private int id ;
       private  String name;
       private long salary;


       public Employee(int id, String name,long salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
       }
       public long getSalary(){
        return salary;
       }
       public String getName() {
        return name;
    }
        
    }

    public static void main(String args[]){
        List<Employee> employees= Arrays.asList(
            new Employee(1, "Ankush", 60000),
            new Employee(2, "Aryan", 50000),
            new Employee(1, "John", 50000),
            new Employee(2, "Jane", 60000),
            new Employee(3, "Bob", 7500)
        );

        Optional<Employee>employeeWithMaxSalary=employees.stream().max((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
        employeeWithMaxSalary.ifPresent(employee ->
                System.out.println("Employee with maximum salary: " + employee.getName()));
   }

    
}
