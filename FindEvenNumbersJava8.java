package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class FindEvenNumbersJava8 {
    public static void main(String[] args) {
        // Sample integer array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find and print even numbers using Java 8 Stream
        System.out.println("Even numbers in the array:");
        Arrays.stream(numbers)
              .filter(number -> number % 2 == 0)
              .forEach(System.out::println);
    }
}