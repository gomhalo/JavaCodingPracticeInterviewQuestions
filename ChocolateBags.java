package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class ChocolateBags {
    public static int minDifference(int[] chocolates) {
    	
    	int n = chocolates.length;
        int totalSum = Arrays.stream(chocolates).sum();
        int target = totalSum / 2;
        
        // dp[i] will be true if a subset with sum i can be formed using the given elements
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int chocolate : chocolates) {
            for (int j = target; j >= chocolate; j--) {
                dp[j] = dp[j] || dp[j - chocolate];
            }
        }

        // Find the largest j such that dp[j] is true
        int sum1 = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[j]) {
                sum1 = j;
                break;
            }
        }

        int sum2 = totalSum - sum1;
        return Math.abs(sum1 - sum2);
    	
    	
    	
    	// Sort the array in descending order
//        Arrays.sort(chocolates);
//        int sum1 = 0, sum2 = 0;
//
//        // Distribute chocolates to minimize the absolute difference
//        for (int i = chocolates.length - 1; i >= 0; i--) {
//            if (sum1 <= sum2) {
//                sum1 += chocolates[i];
//            } else {
//                sum2 += chocolates[i];
//            }
//        }
//
//        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
//        int[] chocolates = {12, 3, 6, 4, 2}; // Example array of chocolates in each bag
    	int[] chocolates = {7, 3, 1, 8, 4,5}; // Example array of chocolates in each bag

        int result = minDifference(chocolates);
        System.out.println("The minimum absolute difference between the total number of chocolates: " + result);
    }
}