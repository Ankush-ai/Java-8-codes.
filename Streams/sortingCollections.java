package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class sortingCollections {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ankush", 1, 50000L));
        employees.add(new Employee("Rohan", 2, 50000L));
        employees.add(new Employee("Chirag", 3, 50000L));
        employees.add(new Employee("Aabid", 4, 50000L));
        employees.add(new Employee("Ranvijay", 5, 50000L));
        employees.add(new Employee("Abrar", 6, 50000L));
        employees.add(new Employee("Asrar", 7, 50000L));
        employees.add(new Employee("Aziz", 8, 50000L));

        // Sorting employees based on id using Streams
        employees.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .forEach(employee -> System.out.println(employee));
        Collections.sort(employees, Comparator.comparing(Employee::getId));
        employees.forEach(employee -> System.out.println(employee));

    }

}
