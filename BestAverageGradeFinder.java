package CodingPracticeInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.AbstractMap.SimpleEntry;

public class BestAverageGradeFinder {
    public static void main(String[] args) {
        // Create a map to store student names and their grades
        Map<String, int[]> studentGrades = new HashMap<>();

        // Populate the map with student names and their grades
        studentGrades.put("John", new int[]{95, 89, 78, 88, 92});
        studentGrades.put("Alice", new int[]{75, 82, 89, 91, 94});
        studentGrades.put("Bob", new int[]{98, 97, 92, 88, 95});
        studentGrades.put("Emma", new int[]{88, 86, 90, 79, 92});
        

        // Calculate the average grade for each student
        Map<String, Double> averageGrades = new HashMap<>();
        for (Map.Entry<String, int[]> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int[] grades = entry.getValue();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double averageGrade = (double) sum / grades.length;
            averageGrades.put(studentName, averageGrade);
        }

        // Find the student with the highest average grade
        String bestStudentName = null;
        double bestAverageGrade = Double.NEGATIVE_INFINITY;
        for (Map.Entry<String, Double> entry : averageGrades.entrySet()) {
            if (entry.getValue() > bestAverageGrade) {
                bestAverageGrade = entry.getValue();
                bestStudentName = entry.getKey();
            }
        }

        // Output the result
        System.out.println("The student with the best average grade is " + bestStudentName +
                " with an average grade of " + bestAverageGrade);
        
       System.out.println("----------------Using Java 8----------------------------"); 
        
//This is how to do it using java8
        
        // Find the student with the best average
        Optional<SimpleEntry<String, Double>> bestStudent = studentGrades.entrySet().stream()
            .map(entry -> new HashMap.SimpleEntry<>(entry.getKey(),average(entry.getValue())))
            .max(Map.Entry.comparingByValue());

        // Print the result
        bestStudent.ifPresent(entry -> 
            System.out.println("Best student: " + entry.getKey() + " with average grade: " + entry.getValue())
        );
        
    }
    
    private static double average(int[] grades) {
        return java.util.Arrays.stream(grades).average().orElse(0);
    }
}