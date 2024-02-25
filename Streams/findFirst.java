package Streams;

import java.util.ArrayList;
import java.util.List;

class JobApplicant {
    private String name;
    private String primarySkill;

    public JobApplicant(String name, String primarySkill) {
        this.name = name;
        this.primarySkill = primarySkill;
    }

    public String getName() {
        return name;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }
}

public class findFirst {
    public static void main(String[] args) {
        // Creating a list of job applicants
        List<JobApplicant> applicants = new ArrayList<>();
        applicants.add(new JobApplicant("John", "Java"));
        applicants.add(new JobApplicant("Jane", "Python"));
        applicants.add(new JobApplicant("Bob", "JavaScript"));
        applicants.add(new JobApplicant("Alice", "Java"));

        // Finding the first applicant who knows Java
        JobApplicant result = applicants.stream()
                .filter(applicant -> "Java".equals(applicant.getPrimarySkill()))
                .findFirst()
                .orElse(null);

        // Displaying the result
        if (result != null) {
            System.out.println("The first Java developer is: " + result.getName());
        } else {
            System.out.println("No Java developer found in the applicants.");
        }
    }
}
