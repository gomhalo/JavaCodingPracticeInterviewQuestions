package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormLargeDigitNumber {

    public static void main(String[] args) {
        // Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
        // Since the result may be very large, so you need to return a string instead of an integer.
        // Input: [3, 30, 34, 5, 9]
        
//        List<Integer> nums = Arrays.asList(3, 30, 34, 5, 9);
        List<Integer> nums = Arrays.asList(329, 30, 34, 57, 9);
        System.out.println(formLargestNumber(nums));
    }

    public static String formLargestNumber(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return "";
        }

        // Convert integers to strings and split multi-digit numbers into single digits
        List<String> strNums = nums.stream()
                                   .flatMap(num -> Arrays.stream(num.toString().split("")))
                                   .collect(Collectors.toList());

        // Sort the strings based on the custom comparator
        strNums.sort((a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is '0', the entire number is '0'
        if (strNums.get(0).equals("0")) {
            return "0";
        }

        // Join the sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}