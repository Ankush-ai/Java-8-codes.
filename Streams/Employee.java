package Streams;

public class Employee {
    private String name;
    private Integer id;
    private Long salary;

    // Default constructor without arguments
    public Employee() {
    }

    // Constructor with arguments
    public Employee(String name, Integer id, Long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Getter and Setter methods for id
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    // Getter and Setter methods for salary
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
