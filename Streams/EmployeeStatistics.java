package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class EmployeeStatistics {
    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("Anananta", 25),
                new Employee("bob", 27),
                new Employee("Jordan belford", 37),
                new Employee("Donny Daimond", 31),
                new Employee("John", 25),
                new Employee("Alice", 30),
                new Employee("Bobby", 25),
                new Employee("Eve", 30),
                new Employee("Charlie", 35)
        );

        IntSummaryStatistics ageStatistics = emp.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics();

        System.out.println("Max Age: " + ageStatistics.getMax());
        System.out.println("Min Age: " + ageStatistics.getMin());
        System.out.println("Average Age: " + ageStatistics.getAverage());
    }
}
