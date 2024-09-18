package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 101, 20));
        employees.add(new Employee("Alice", 102, 30));
        employees.add(new Employee("Bob", 103, 50));
        employees.add(new Employee("Alice", 104, 25));

        // Sorting employees by name using Java 8 Streams
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());
        
        
     // Sorting employees by name and then by age using Java 8 Streams
        List<Employee> sortedEmployeesByNameAndAge = employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName)
                        .thenComparing(Employee::getEmpAge))
                .collect(Collectors.toList());
        
        System.out.println("--------- Comparing Employee List By Name ----------");

        // Printing sorted list
        sortedEmployees.forEach(System.out::println);
        
        System.out.println("--------- Comparing Employee List By Name then By Age-----------");
        
        // Printing sorted list
        sortedEmployeesByNameAndAge.forEach(System.out::println);
    }
}