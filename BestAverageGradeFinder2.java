package CodingPracticeInterviewQuestions;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

public class BestAverageGradeFinder2 {
    public static void main(String[] args) {
        // Sample array of student names and their grades
        Object[][] studentData = {
            {"John", 95.0, 89.0, 78.0, 88.0, 92.0},
            {"Alice", 75.0, 82.0, 89.0, 91.0, 94.0},
            {"Bob", 98.0, 97.0, 92.0, 88.0, 95.0},
            {"Emma", 88.0, 86.0, 90.0, 79.0, 92.0}
        };

        String bestStudentName = "";
        double bestAverageGrade = Double.NEGATIVE_INFINITY;

        for (Object[] student : studentData) {
            String studentName = (String) student[0];
            double[] grades = new double[student.length - 1];
            
            for (int i = 1; i < student.length; i++) {
                grades[i - 1] = (double) student[i];
            }
            
            double sum = 0.0;
            for (double grade : grades) {
                sum += grade;
            }
            
            double averageGrade = sum / grades.length;

            if (averageGrade > bestAverageGrade) {
                bestAverageGrade = averageGrade;
                bestStudentName = studentName;
            }
        }

        System.out.println("The student with the best average grade is " + bestStudentName +
                " with an average grade of " + bestAverageGrade);
        
        
        
        
        
        System.out.println("----------------Using Java 8----------------------------"); 
        
      //This is how to do it using java8
        
     // Find the student with the best average
        Optional<SimpleEntry<String, Double>> bestStudent = Arrays.stream(studentData)
            .map(entry -> new SimpleEntry<>((String) entry[0], average(Arrays.copyOfRange(entry, 1, entry.length))))
            .max(Map.Entry.comparingByValue());

        // Print the result
        bestStudent.ifPresent(entry -> 
            System.out.println("Best student: " + entry.getKey() + " with average grade: " + entry.getValue())
        );
    }
    
    private static double average(Object[] grades) {
        return Arrays.stream(grades)
            .mapToDouble(g -> (double) g)
            .average()
            .orElse(0);
    }
    
}