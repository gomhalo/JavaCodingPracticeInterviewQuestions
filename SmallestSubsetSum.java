package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestSubsetSum {

    public static List<Integer> findSmallestSubset(int[] nums, int target) {
        // Sort the array in descending order
        Arrays.sort(nums);
        int n = nums.length;
        
        // Reverse the sorted array to make it descending
        int[] descNums = new int[n];
        for (int i = 0; i < n; i++) {
            descNums[i] = nums[n - 1 - i];
        }
        
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        
        // Iterate through the array and accumulate values until sum >= target
        for (int num : descNums) {
            sum += num;
            result.add(num);
            if (sum >= target) {
                break;
            }
        }
        
        // Return the result list
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 10, 25, 5, 20};
//        int target = 30;
    	
    	 int[] nums = {1,3};
         int target = 0;

        List<Integer> smallestSubset = findSmallestSubset(nums, target);
        
        System.out.println("Smallest subset with sum >= " + target + " is: " + smallestSubset);
    }
}