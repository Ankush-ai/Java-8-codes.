package Streams;
import java.util.List;
import java.util.ArrayList;

public class mapToDouble_sum {
    private int id;
    private String name;
    private double salary;  // Change Long to double for the salary field

    public mapToDouble_sum(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String args[]) {
        List<mapToDouble_sum> list = new ArrayList<>();
        list.add(new mapToDouble_sum(1, "Ankush", 60000.0));
        list.add(new mapToDouble_sum(2, "Anubhuti", 60000.0));
        list.add(new mapToDouble_sum(3, "Ronit", 18000.0));

        double sumOfSalaries = list.stream().mapToDouble(mapToDouble_sum::getSalary).sum();

        System.out.println("Sum of salaries: " + sumOfSalaries);
    }
}
